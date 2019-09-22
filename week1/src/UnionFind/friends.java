package UnionFind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class friends {
    HashMap<Integer,List<Integer>> map;
    public int findCircleNum(int[][] M) {
        map = new HashMap<>();
        for(int i=0;i<M.length;i++)
        {   List<Integer> list = new ArrayList<Integer>();
            map.put(i,list);
        }

        for(int i=0;i<M.length;i++)
        {
            List<Integer> v = map.get(i);
            for(int j=0;j<M.length;j++)
            {
                if(M[i][j] == 1)
                    v.add(j);
            }
            map.put(i,v);
        }

        // System.out.println(map);
        int[] visited = new int[M.length];
        int count = 0;
        for(int i=0;i<M.length;i++)
        {
            if(visited[i] == 0)
            {
                count++;
                dfs(i,visited);

            }
        }
        return count;
    }


    public void dfs(int index,int[] visited)
    {
        if(visited[index] == 0)
        {
            visited[index] = 1;
            List<Integer> list = map.get(index);
            for(int j: list)
                dfs(j,visited);
        }
    }
}
