package BitOperations;

import java.math.BigInteger;

public class compliment {
    public int findComplement(int num) {
        String g = Integer.toBinaryString(num);
        int len = g.length();
        String gcomp = "";
        for(int i=0;i<len;i++)
        {
            gcomp = gcomp + "1";
        }
        BigInteger a = new BigInteger(gcomp,2);
        BigInteger b = new BigInteger(g,2);
        BigInteger c  = a.subtract(b);
        return c.intValue();
    }
}
