package Arrays;

import java.util.ArrayList;
import java.util.List;

public class sortByParity {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2 == 0)
                even.add(A[i]);
            else
                odd.add(A[i]);
        }

        int[] result = new int[A.length];
        for(int i=0;i<even.size();i++)
        {
            result[i] = even.get(i);
        }
        for(int i=0;i<odd.size();i++)
        {
            result[even.size()+i] = odd.get(i);
        }

        return result;
    }
}
