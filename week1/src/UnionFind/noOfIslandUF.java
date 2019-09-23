package UnionFind;

import java.util.HashSet;

public class noOfIslandUF {
    int[][] visited;
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
    public void call_connect(int i,int j,char[][] grid,int[][] visited,UnionFind uF,int n,int m)
    {
        if(visited[i][j] == 1)
            return;
        visited[i][j]=1;
        if(i-1 >= 0 && grid[i-1][j] == '1' && visited[i-1][j] != 1)
        {
            uF.union(i*m+j,(i-1)*m+j);
            call_connect(i-1,j,grid,visited,uF,n,m);
        }

        if(j-1 >= 0 && grid[i][j-1] == '1' && visited[i][j-1] != 1)
        {
            uF.union(i*m+j,i*m+j-1);
            call_connect(i,j-1,grid,visited,uF,n,m);
        }
        if(i+1 < n && grid[i+1][j] == '1' && visited[i+1][j] != 1)
        {
            uF.union(i*m+j,(i+1)*m+j);
            call_connect(i+1,j,grid,visited,uF,n,m);
        }
        if(j+1 < m && grid[i][j+1] == '1' && visited[i][j+1] != 1)
        {
            uF.union(i*m+j,i*m+j+1);
            call_connect(i,j+1,grid,visited,uF,n,m);
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        if(n == 0)
            return 0;
        int m = grid[0].length;
        UnionFind uF = new UnionFind(n*m+n*m);
        int k=0;
        visited = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == '1')
                {
                    call_connect(i,j,grid,visited,uF,n,m);
                }
            }
        }


        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == '1')
                {
                    set.add(uF.ids[i*m+j]);
                }
            }
        }

        return set.size();
    }
}
