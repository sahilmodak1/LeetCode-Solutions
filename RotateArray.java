/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
*/
public class RotateArray {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    
     public static void reverse(int[] nums, int start, int end) {
        int temp;
        for(int i=start;i<(start+end+1)/2;i++)
        {
            temp=nums[i];
            nums[i]=nums[(start+end+1)-(i+1)];
            nums[(start+end+1)-(i+1)]=temp;
        }
         
    }
}