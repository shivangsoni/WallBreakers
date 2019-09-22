package Maths;

import java.util.ArrayList;
import java.util.List;

public class dividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
            int num = i;
            int flag = 0;
            left = i;
            while(left!=0)
            {
                if(left%10 != 0 && num%(left%10) != 0)
                {
                    flag = 1;
                    break;
                }
                if(left%10 == 0)
                {
                    flag = 1;
                    break;
                }
                left = left/10;
            }
            if(flag == 0)
                list.add(num);
        }
        return list;
    }
}
