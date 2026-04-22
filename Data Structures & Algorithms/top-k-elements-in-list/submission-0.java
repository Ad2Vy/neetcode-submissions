class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /* nums , k = freq.
        [1,2,2,2,3,3,3,3]

        create a map<int,int> to store freq of all the elements.
        Sort the map based on K
        return till K.
        */
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int x: nums){
            hash.put(x, hash.getOrDefault(x,0)+1);
        }
        List<int[]> arr= new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: hash.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a,b) -> b[0] - a[0]);

        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr.get(i)[1];
        }
        return res;
    }
}
