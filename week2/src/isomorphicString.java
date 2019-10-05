import java.util.HashMap;

public class isomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> mapS = new HashMap<Character,Integer>();
        HashMap<Character,Integer> mapT = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(mapS.containsKey(s.charAt(i)) && mapT.containsKey(t.charAt(i)))
            {
                int index1 = i - mapS.get(s.charAt(i));
                int index2 = i - mapT.get(t.charAt(i));
                if(index1 != index2)
                    return false;
            }
            else if(mapS.containsKey(s.charAt(i)) || mapT.containsKey(t.charAt(i)))
                return false;

            mapS.put(s.charAt(i),i);
            mapT.put(t.charAt(i),i);
        }
        return true;
    }
}
