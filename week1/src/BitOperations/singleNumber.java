package BitOperations;

public class singleNumber {
    public int singleNumber(int[] nums) {
        int[] nums1 = new int[100000];
        int[] negnums = new int[100000];
        for(int i=0;i<100000;i++){
            nums1[i] = 0;
            negnums[i]=0;
        }
        for(int i=0;i<nums.length;i++)
        {
            int j = nums[i];
            if(j>0)
            {
                nums1[j]++;
            }
            else
            {
                negnums[-j]++;
            }
        }
        for(int i=0;i<100000;i++)
        {
            if(nums1[i] == 1)
                return i;
            else if(negnums[i] == 1)
                return -i;
        }
        return -1;
    }
}
