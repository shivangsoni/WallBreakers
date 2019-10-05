import java.util.HashSet;

public class sudoku {

    int[] array = new int[27];
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<board.length;i++)
        {
            set = new HashSet<Character>();
            for(int j=0;j<board[0].length;j++)
            {
                if(set.contains(board[i][j]))
                    return false;
                else if(!set.contains(board[i][j]) && board[i][j] != '.')
                {
                    set.add(board[i][j]);
                }
            }
            array[i] = 1;
        }

        // System.out.println("Row Checked");
        for(int i=0;i<board[0].length;i++)
        {
            set = new HashSet<Character>();
            for(int j=0;j<board.length;j++)
            {
                if(set.contains(board[j][i]))
                {
                    System.out.println(set);
                    return false;
                }
                else if(!set.contains(board[j][i]) && board[j][i] != '.')
                    set.add(board[j][i]);
            }
            array[i+9] = 1;
        }
        //System.out.println("Col Checked");
        int k=0;
        for(int i=0;i<board.length;i = i+3)
        {

            for(int j=0;j<board[0].length;j=j+3)
            {
                set = new HashSet<Character>();
                for(int h=i;h<i+3;h++)
                    for(int g=j;g<j+3;g++)
                    {
                        if(set.contains(board[h][g]))
                            return false;
                        else if(!set.contains(board[h][g]) && board[h][g] != '.')
                            set.add(board[h][g]);
                    }
            }
            array[18+k] = 1;
            k++;
        }
        return true;
    }

}
