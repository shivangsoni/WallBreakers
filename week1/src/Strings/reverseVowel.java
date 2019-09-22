package Strings;

import java.util.ArrayList;
import java.util.List;

public class reverseVowel {

    public String reverseVowels(String s1) {
        StringBuilder s = new StringBuilder(s1);
        List<Integer> index = new ArrayList<Integer>();
        List<Character> vowels = new ArrayList<Character>();
        for(int i=0;i<s1.length();i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
            {
                index.add(i);
                vowels.add(s.charAt(i));
            }
            else
                continue;
        }
        for(int i=0;i<index.size();i++)
        {
            s.setCharAt(index.get(i),vowels.get(index.size() - 1 - i));
        }
        return s.toString();
    }

}
