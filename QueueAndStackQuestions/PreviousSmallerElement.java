package QueueAndStackQuestions;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Solution{
    public int[] prevSmallerElement(int arr[]){
        int result[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(s.size()>0 && s.peek()>arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = s.peek();
            }

            s.push(arr[i]);
        }

        return result;

    }
}

public class PreviousSmallerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        Solution ob = new Solution();

        int result[] = ob.prevSmallerElement(nums);
        System.out.println(Arrays.toString(result));

    }
    
}
