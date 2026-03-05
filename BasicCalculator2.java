//basically I am using infix expression solution here

import java.util.*;

public class BasicCalculator2 {
    public static int precedence(char ch){
        if(ch == '+' || ch == '-') return 1;
        if(ch == '*' || ch == '/') return 2;
        return 0;
    }
    public static int doOperation(int a, int b, char op){
        if(op == '+') return a+b;
        if(op == '-') return a-b;
        if(op == '*') return a*b;
        if(op == '/') return a/b;
        
        return 0;
    }
    public static int calculate(String str){
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int num = 0 ;
            if(Character.isDigit(ch)){
                while(i < str.length() && Character.isDigit(str.charAt(i))){
                    num = num *10 + (str.charAt(i) - '0');
                    i++;
                }
                values.push(num);
                i--;
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
                while(!ops.isEmpty() && precedence(str.charAt(i)) <= precedence(ops.peek())){
                    int val2 = values.pop();
                    int val1 = values.pop();
                    char exp = ops.pop();
                    values.push(doOperation(val1,val2, exp));
                }
                ops.push(ch);
            }
        }
        while(!ops.isEmpty()){
            int val2 = values.pop();
            int val1 = values.pop();
            char exp = ops.pop();
            values.push(doOperation(val1,val2, exp));
        }
        return values.pop();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(calculate(str));
    }
}