package Strings;

public class detectCapital {
    public boolean detectCapitalUse(String word) {
        String word1 = word.toUpperCase();
        String word2 = word.toLowerCase();
        if(word1.equals(word))
            return true;
        if(word2.equals(word))
            return true;

        int f = (int)word.charAt(0) - 97;
        if(f>=0)
            return false;
        for(int i=1;i<word.length();i++)
        {
            if((int)word.charAt(i) - 97 < 0 )
                return false;
        }
        return true;
    }
}
