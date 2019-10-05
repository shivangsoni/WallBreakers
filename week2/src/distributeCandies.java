import java.util.HashSet;

public class distributeCandies {
    public int distributeCandies(int[] candies) {
        int len = candies.length/2;
        int types = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<candies.length;i++)
            set.add(candies[i]);
        if(set.size() >= candies.length/2)
            return candies.length/2;
        return set.size();
    }
}
