class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*We can start by sorting the given array.
            [-1,0,1,2,-1,-4] ---> [-4,-1,-1,0,1,2]
            such possible triplets are {-1,0,1} , {-1,-1,2}
            i = j + k 
            should be the logical approach.
                j=arr.length-1;
                k=arr.length-2;
        */
        Arrays.sort(nums);
        List<List<Integer>> list= new ArrayList<>();
        int i=0;
        if(nums.length<3){
            return list;
        }
        for(int x=0;x<nums.length;x++){
            if( nums[x] > 0) break;
            if( x>0 && nums[x]==nums[x-1]) continue;
            int j=x+1,k=nums.length-1;
            while(j<k){
                int sum= nums[x]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }
                else if( sum<0){ j++;}
                else {
                    list.add(Arrays.asList(nums[x],nums[j],nums[k]));
                    j++;k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                }

            }

        }
        return list;

    }
}
