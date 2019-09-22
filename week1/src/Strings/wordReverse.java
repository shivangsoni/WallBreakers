package Strings;

public class wordReverse {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        String rev="";

        for(int i=0;i<str.length;i++)
        {
            String g = new StringBuilder(str[i]).reverse().toString();

            rev=rev+g;
            if(i!=str.length-1)
                rev=rev+" ";
        }
        return rev;
    }
}
