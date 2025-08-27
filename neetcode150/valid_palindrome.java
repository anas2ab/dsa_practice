class Solution {
    public boolean isPalindrome(String s) {
        String alphanumeric = s.replace(" ", "").replaceAll("\\p{Punct}", "").toLowerCase();
        
        int l = 0; 
        int r = alphanumeric.length() - 1;

        while(l < r) {
            if(alphanumeric.charAt(l) != alphanumeric.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }
}
