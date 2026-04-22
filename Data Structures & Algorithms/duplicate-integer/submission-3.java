class Solution {
    public boolean hasDuplicate1(int[] nums) {
        HashSet<Integer> hash= new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i])){
                return true;
            }
            hash.add(nums[i]);
        }
        return false;
    }

    public boolean hasDuplicate(int[] nums){
        HashSet<Integer> hash= new HashSet<>();
        for(int x: nums){if(hash.contains(x)) return true; else hash.add(x);}
        return false; 
    }
}
