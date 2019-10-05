import java.util.HashSet;

public class jewelsAndStone {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> strJ = new HashSet<Character>();
        for(int i=0;i<J.length();i++)
            strJ.add(J.charAt(i));

        int count = 0;
        for(int i=0;i<S.length();i++)
            if(strJ.contains(S.charAt(i)))
                count++;
        return count;
    }
}
