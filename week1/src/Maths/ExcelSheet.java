package Maths;

public class ExcelSheet {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++)
        {
            int char1 = (int)s.charAt(i) - 64;
            result = result * 26 + char1;
        }
        return result;
    }
}
