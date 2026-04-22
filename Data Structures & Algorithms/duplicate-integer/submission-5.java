class Solution {
    public boolean hasDuplicate1(int[] nums) {
        /* for i in nums.length
                int x=i;
                for j = i+1; j++; j<nums.length:
                    if(nums[i] == nums[j]):
                        return true;                    
            return false;
        */
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[i]==nums[j]) return true;
            }
        }
        return false;

    }

    public boolean hasDuplicate(int[] nums){
        HashSet<Integer> hash= new HashSet<Integer>();
        for(int i=0; i< nums.length; i++){
            if(hash.contains(nums[i]))return true;
            else hash.add(nums[i]);
        }
        return false;
    }
}