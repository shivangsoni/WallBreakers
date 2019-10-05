import java.util.HashSet;
import java.util.*;

public class numberOfSpecialEquGroups {
    public int numSpecialEquivGroups(String[] A) {
        int[] even = new int[26];
        int[] odd = new int[26];

        HashSet<String> set = new HashSet<String>();
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length();j++)
            {
                if(j%2 == 0)
                    even[A[i].charAt(j) - 'a']++;
                else
                    odd[A[i].charAt(j) - 'a']++;
            }
            set.add(Arrays.toString(even) +"  "+Arrays.toString(odd));
            even = new int[26];
            odd = new int[26];
        }


        return set.size();
    }
}
