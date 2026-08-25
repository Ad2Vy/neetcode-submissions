class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] check = new int[26];
        for (char c : s1.toCharArray()) {
            check[c - 'a']++;
        }
        int l = 0, r = s1.length() - 1;
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s2.charAt(i) - 'a']++;
        }
        if (compare(arr, check)) return true;
        while (r < s2.length() - 1) {
            arr[s2.charAt(l) - 'a']--;
            arr[s2.charAt(r + 1) - 'a']++;
            l++;
            r++;
            if (compare(arr, check)) return true;
        }
        return false;
    }

    public boolean compare(int[] arr, int[] check) {
        for (int i = 0; i < 26; i++) {
            if (check[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}
