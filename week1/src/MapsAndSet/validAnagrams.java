package MapsAndSet;

import java.util.HashMap;

public class validAnagrams {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mapS = new HashMap<Character,Integer>();
        if(s.length() != t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(mapS.containsKey(s.charAt(i)))
            {
                int count = mapS.get(s.charAt(i));
                mapS.put(s.charAt(i),count+1);
            }
            else
            {
                mapS.put(s.charAt(i),1);
            }
        }


        HashMap<Character,Integer> mapT = new HashMap<Character,Integer>();

        for(int i=0;i<t.length();i++)
        {
            if(mapT.containsKey(t.charAt(i)))
            {
                int count = mapT.get(t.charAt(i));
                mapT.put(t.charAt(i),count+1);
            }
            else
            {
                mapT.put(t.charAt(i),1);
            }
        }

        for(char key: mapS.keySet())
        {
            if(!mapT.containsKey(key))
                return false;
            int r =mapT.get(key);
            int y =mapS.get(key);
            if( r != y )
            {
                //System.out.println(key +" "+mapS.get(key)+" "+mapT.get(key)+" "+"S"+mapS.containsKey(key)+" "+mapT.containsKey(key));
                return false;
            }

        }

        if(mapS.size() != mapT.size())
        {
            return false;
        }
        return true;
    }
}
