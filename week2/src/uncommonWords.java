import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class uncommonWords {
    public String[] uncommonFromSentences(String A, String B) {
        String[] res = A.split("\\s+");
        String[] res1 = B.split("\\s+");

        HashMap<String,Integer> map = new HashMap<String,Integer>();

        for(int i=0;i<res.length;i++)
        {
            if(map.containsKey(res[i]))
            {
                int count = map.get(res[i]);
                map.put(res[i],count+1);
            }
            else
            {
                map.put(res[i],1);
            }
        }

        for(int i=0;i<res1.length;i++)
        {
            if(map.containsKey(res1[i]))
            {
                int count = map.get(res1[i]);
                map.put(res1[i],count+1);
            }
            else
            {
                map.put(res1[i],1);
            }
        }

        List<String> list = new ArrayList<String>();
        for(String f: map.keySet())
        {
            int c = map.get(f);
            if(c == 1)
                list.add(f);
        }

        String[] result = new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            result[i] = list.get(i);
        }
        return result;
    }
}
