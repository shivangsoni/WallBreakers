package BitOperations;

public class binaryGAp {
    public int binaryGap(int N) {
        String g = "";
        while(N != 0)
        {
            g = Integer.toString(N%2)+g;
            N=N/2;
        }
        int left = 0;
        int right = 0;
        int max = -1;
        int flag = 0;
        for(int i=0;i<g.length();i++)
        {
            if(g.charAt(i) == '1' && flag == 0)
            {
                left = i;
                flag = 1;
            }
            if(g.charAt(i) == '1' && flag == 1)
            {
                if(max<i-left)
                {
                    max = i-left;
                }
                left = i;
            }
        }
        return max;
    }
}
