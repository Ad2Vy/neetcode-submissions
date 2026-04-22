class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] count= new int[26];
            String str= strs[i];
            for(char c:str.toCharArray()){
                count[c-'a']++;
            }
            String countStr= Arrays.toString(count);
            if(!map.containsKey(countStr)){
                map.put(countStr,new ArrayList<>());
            }
            map.get(countStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
    
}
