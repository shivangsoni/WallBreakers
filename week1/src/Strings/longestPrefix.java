package Strings;

public class longestPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        String s1 = strs[0];
        int length1 = strs[0].length();
        String s2 = "";
        for(int i=1;i<strs.length;i++)
        {

            length1 = s1.length();
            int length2 = strs[i].length();
            int minlength = 0;
            if(length1>length2)
                minlength = length2;
            else
                minlength = length1;
            for(int j=0;j<minlength+1;j++)
            {
                if(s1.substring(0,j).equals(strs[i].substring(0,j)))
                {
                    s2 = s1.substring(0,j);
                }
            }
            s1 = s2;
        }
        return s2;
    }

}
