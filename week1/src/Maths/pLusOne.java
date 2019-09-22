package Maths;

public class pLusOne {

    public int[] plusOne(int[] digits) {
        int carry = 0;
        int[] newdigits  = new int[digits.length];
        int[] newdigits1 = new int[digits.length+1];
        for(int i=digits.length-1;i>=0;i--)
        {
            if(i == digits.length - 1)
            {
                newdigits[i] = digits[i] +1 + carry;
                carry = newdigits[i]/10;
                newdigits[i] = newdigits[i]%10;
            }
            else
            {
                newdigits[i] = digits[i] + carry;
                carry = newdigits[i]/10;
                newdigits[i] = newdigits[i]%10;
            }
            //System.out.println(newdigits[i]+"Carry now"+carry);
        }

        int flag = 0;
        if(carry == 1)
        {
            flag = 1;
            for(int i=digits.length;i>=1;i--)
            {
                newdigits1[i] = newdigits[i-1];
            }
            newdigits1[0] = carry;
        }
        if(flag == 1)
            return newdigits1;
        return newdigits;
    }

}
