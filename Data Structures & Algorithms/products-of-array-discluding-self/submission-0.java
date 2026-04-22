class Solution {
    /*
    {1,2,4,6}
    pre={1,1,2,4}
    suf={48,24,6,1}
    
    */
    public int[] productExceptSelf(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            int j=nums.length-1-i;
            left[i]=left[i-1]*nums[i-1];
            right[j]=right[j+1]*nums[j+1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=left[i]*right[i];
        }
        return nums;
    }
}  
