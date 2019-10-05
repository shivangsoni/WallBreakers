import java.util.HashMap;

public class wordPattern {
    public boolean wordPattern(String pattern, String str) {
        int countSpaces = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ' ')
                countSpaces++;
        }
        if(str.length() != 0)
            countSpaces++;
        if(countSpaces != pattern.length())
            return false;

        HashMap<Character,Integer> mapPattern = new HashMap<Character,Integer>();
        HashMap<String,Integer> mapStr = new HashMap<String,Integer>();
        int j=0;
        for(int i=0;i<pattern.length();i++)
        {
            String s = "";
            while(str.charAt(j) != ' ' && j != str.length()-1)
            {
                s = s+Character.toString(str.charAt(j));
                j++;
            }
            j++;
            if(j == str.length())
            {
                s=s+Character.toString(str.charAt(str.length()-1));
            }
            //System.out.println(s+"S");
            if(mapPattern.containsKey(pattern.charAt(i)) && mapStr.containsKey(s))
            {
                int index1 = i - mapPattern.get(pattern.charAt(i));
                int index2 = i - mapStr.get(s);
                if(index1 != index2)
                    return false;
            }
            else if(mapPattern.containsKey(pattern.charAt(i)) || mapStr.containsKey(s))
                return false;
            else
            {
                mapPattern.put(pattern.charAt(i),i);
                mapStr.put(s,i);
            }
        }
        return true;

    }
}
