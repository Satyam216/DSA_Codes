package QueueAndStackQuestions;

import java.util.*;

class Solution{
    public int[] nextGreaterElement(int nums1[], int nums2[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        int nextGreaterNums[] = new int[nums2.length];
        Arrays.fill(nextGreaterNums,0);

        Stack<Integer> s = new Stack<>();

        for(int i=nums2.length-1; i>=0; i--){
            while(s.size()>0 && s.peek() <= nums2[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextGreaterNums[i] = -1;
            }else{
                nextGreaterNums[i] = s.peek();
            }

            s.push(nums2[i]);
        }

        int result[] = new int[nums1.length];

        for(int i=0; i<nums2.length; i++){
            map.put(nums2[i],nextGreaterNums[i]);
        }

        for(int i=0; i<nums1.length; i++){
            result[i] = map.get(nums1[i]);
        }

        return result;

    }
}

public class NextGreaterElement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String arr1[] = str1.split(" ");
        int elements1[] = new int[arr1.length];

        for(int i=0; i<arr1.length; i++){
            elements1[i] = Integer.parseInt(arr1[i]);
        }

        String str2 = sc.nextLine();
        String arr2[] = str2.split(" ");
        int elements2[] = new int[arr2.length];

        for(int i=0; i<arr2.length; i++){
            elements2[i] = Integer.parseInt(arr2[i]);
        }

        Solution ob = new Solution();

        int result[] = ob.nextGreaterElement(elements1,elements2);

        for(int n : result){
            System.out.print(n + " ");
        }

    }
    
}
