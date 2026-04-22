class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap<String,List<String>> map=new HashMap<>();
        // for(int i=0;i<strs.length;i++){
        //     int[] count= new int[26];
        //     String str= strs[i];
        //     for(char c:str.toCharArray()){
        //         count[c-'a']++;
        //     }
        //     String countStr= Arrays.toString(count);
        //     if(!map.containsKey(countStr)){
        //         map.put(countStr,new ArrayList<>());
        //     }
        //     map.get(countStr).add(str);
        // }
        // return new ArrayList<>(map.values());
        /* create a char array and increase the frequency of the elements
            put this string(charArray) in hashmap checking if already present then 
            add the index of current element.
        */
        HashMap<String,List<String>> hash= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] count= new int[26];
            for(int j=0;j<strs[i].length();j++){
                count[strs[i].charAt(j)-'a']++;
            }
            String str=Arrays.toString(count);
            if(!hash.containsKey(str)){
                hash.put(str,new ArrayList<>());
            }
            hash.get(str).add(strs[i]);
            
        }
        return new ArrayList<>(hash.values());
    }
    
}
