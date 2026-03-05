package QueueAndStackQuestions;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int elements[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            elements[i] = Integer.parseInt(arr[i]);
        }

        int ans[] = new int[elements.length];
        Arrays.fill(ans,0);

        Stack<Integer> s = new Stack<>();

        for(int i=elements.length-1; i>=0; i--){
            while(s.size()>0 && s.peek() < elements[i]){
                s.pop();
            }

            if(s.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = s.peek();
            }

            s.push(elements[i]);
        }

        for(int n : ans){
            System.out.print(n + " ");
        }

    }
    
}
