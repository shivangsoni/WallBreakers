package Maths;

public class powOf2 {
    public boolean isPowerOf2(int n){
        if (n == 0) return false;
        while (n%2 == 0) n/=2;
         return n == 1;
    }

}
