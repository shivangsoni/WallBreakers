public class happyNumber {
    public int sqsum(int n)
    {
        int result = 0;
        while(n!=0)
        {
            result = result + (n%10) * (n%10) ;
            n=n/10;
        }
        return result;
    }
    public boolean isHappy(int n) {
        int flag = 0;
        n=sqsum(n);
        while(n/10 != 0 || flag == 0)
        {
            int result = sqsum(n);
            System.out.println(result);
            n=result;
            flag=1;
        }
        if( n == 1)
            return true;
        return false;
    }
}
