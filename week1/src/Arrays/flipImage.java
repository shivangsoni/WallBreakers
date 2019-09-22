package Arrays;

public class flipImage {
    public int[][] flipAndInvertImage(int[][] A) {

        String[] S = new String[A.length];
        for(int i=0;i<A.length;i++)
        {
            String str="";
            for(int j=0;j<A[i].length;j++)
            {
                str=str+Integer.toString(A[i][j]);
            }
            S[i] = str;
        }
        String[] rev = new String[A.length];
        for(int i=0;i<A.length;i++)
            rev[i] = new StringBuilder(S[i]).reverse().toString();

        int[][] result = new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                if(rev[i].charAt(j) == '0')
                    result[i][j]=1;
                else
                    result[i][j]=0;
            }
        }
        return result;
    }

}
