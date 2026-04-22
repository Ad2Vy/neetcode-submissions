class Solution {
    public int[] twoSum(int[] num, int target) {
        int start=0,end=num.length-1;
        while(start<end){
            if(num[start]+num[end] == target)return new int[] {start+1,end+1};
            else if( num[start]+num[end] > target) end--;
            else start++;
        }
        return new int[] {start+1,end+1};
    }
    
}
