package UnionFind;

public class surroundedRegions {
        class UnionFind{
            int count;
            int[] rank;
            int[] ids;

            UnionFind(int N)
            {
                ids = new int[N];
                rank = new int[N];
                count = N;
                for(int i=0;i<N;i++)
                {
                    ids[i] = i;
                    rank[i] = 0;
                }
            }

            int find(int x)
            {
                while(x != ids[x])
                {
                    x = ids[x];
                }
                return x;
            }

            boolean connected(int x, int y)
            {
                return find(x) == find(y);
            }

            void union(int x, int y)
            {

                int i = find(x);
                int j = find(y);
                if (i == j) return;
                if (rank[i] < rank[j]) ids[i] = j;
                else if (rank[i] > rank[j]) ids[j] = i;
                else {
                    ids[j] = i;
                    rank[i]++;
                }
                count--;
            }


        }
        public void solve(char[][] board) {
            if(board.length == 0)
                return;
            int n = board.length;
            int m = board[0].length;
            UnionFind uF = new UnionFind(n*m+1);

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {

                    if((i == 0 || i == n-1 || j == 0 || j == m-1) && board[i][j] == 'O')
                    {
                        uF.union(m*i+j,n*m);
                    }
                    else if(board[i][j] == 'O')
                    {
                        if(board[i-1][j] == 'O')
                        {
                            uF.union(m*i+j, m*(i-1)+j);
                        }

                        if(board[i+1][j] == 'O')
                        {
                            uF.union(m*i+j, m*(i+1)+j);
                        }
                        if( board[i][j-1] == 'O')
                        {
                            uF.union(m*i+j, m*i+(j-1));
                        }
                        if(board[i][j+1] == 'O')
                        {
                            uF.union(m*i+j, m*i+(j+1) );
                        }
                    }
                }


            }

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(board[i][j] == 'O' && !uF.connected(m*i+j,n*m))
                        board[i][j] = 'X';
                }
            }


        }
}
