package BitOperations;

public class hammingDist {

    public int hammingDistance(int x, int y) {
        String num1 = Integer.toBinaryString(x);
        String num2 = Integer.toBinaryString(y);
        System.out.println(num1);
        System.out.println(num2);
        if(num1.length()<num2.length())
        {
            int len1 = num1.length();
            int len2 = num2.length();
            for(int i=0;i<len2-len1;i++)
            {
                num1 = "0"+num1;
            }
        }
        else if(num1.length()>num2.length())
        {
            int len1 = num1.length();
            int len2 = num2.length();
            for(int i=0;i<len1-len2;i++)
            {
                num2 = "0"+num2;
            }
        }
        System.out.println(num1);
        System.out.println(num2);

        int count = 0;

        for(int i=0;i<num1.length();i++)
        {
            if(num1.charAt(i) != num2.charAt(i))
            {
                count++;
            }
        }
        return count;
    }

}
