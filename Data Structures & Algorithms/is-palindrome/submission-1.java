class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str="";
        for(char x: s.toCharArray()){
            if((x<=122 && x>=97)||(x>=48 && x<=57))str+=x; 
        }
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;end--;
        }
        return true;
    }
}
