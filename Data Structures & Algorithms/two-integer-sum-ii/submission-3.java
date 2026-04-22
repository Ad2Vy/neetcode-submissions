class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // key points; array is sorted in non decreasing order. that means the array can have multiple same elements and increasing as the index increases.
        // [ 1, 2 , 3 , 4 , 4, 5, 5, 7]  target = 10
        /*  For i in array:
                two pointers s1, s2;
                if s1 + s2 = target ;
                    return [s1, s2]
                else if s1 + s2 > target:
                    

            */
            int start=0, end=numbers.length-1;
            while (start<end)
            {   int sum=(numbers[start]+numbers[end]);
                if(sum==target)return new int[] {start+1,end+1};
                else if(sum<target)start++;
                else end--;
            }
            return new int[] {start+1,end+1};
    }
}
