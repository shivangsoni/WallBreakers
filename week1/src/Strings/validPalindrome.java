package Strings;

public class validPalindrome {
    public boolean isPalindrome(String s) {
        if(s.equals(""))
            return true;
        String newS = "";
        s = s.toLowerCase();
        newS = s.replaceAll("[^\\w]","");
        if(newS.equals(new StringBuilder(newS).reverse().toString()))
            return true;
        return false;
    }
}
