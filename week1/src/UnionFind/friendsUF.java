package UnionFind;

import java.util.HashSet;

public class friendsUF {
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

    public int findCircleNum(int[][] M) {
        UnionFind uF = new UnionFind(M.length);
        if(M.length == 0)
            return 0;
        for(int i=0;i<M.length;i++)
        {
            for(int j=0;j<M[i].length;j++)
            {
                if(i != j && M[i][j] == 1)
                {
                    uF.union(i,j);
                }
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<M.length;i++)
        {
            set.add(uF.find(i));
        }

        return set.size();
    }
}
