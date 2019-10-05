import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class intersectionClass {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            s.add(nums1[i]);
        }
        HashSet<Integer> d = new HashSet<Integer>();
        for(int i=0;i<nums2.length;i++)
        {
            if(s.contains(nums2[i]))
                d.add(nums2[i]);
        }
        List<Integer> array = new ArrayList<Integer>();
        for(int i : d)
        {
            array.add(i);
        }

        int[] a = new int[array.size()];
        for(int i=0;i<array.size();i++)
        {
            a[i] = array.get(i);
        }
        return a;
    }
}
