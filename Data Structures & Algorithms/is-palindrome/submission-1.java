class Solution {
    public boolean isPalindrome(String s) {

        String t = "";
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){

            if((s.charAt(i) >= 96 && s.charAt(i) <= 122) || Character.isDigit(s.charAt(i))){
                t += s.charAt(i);
            }
        }

        for(int i = 0; i < t.length() / 2; i++){
            if(t.charAt(i) != t.charAt(t.length() - 1 - i)){
                return false;
            }
        }

        return true;
    }
}
