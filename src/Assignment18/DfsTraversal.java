package Assignment18;

import java.util.ArrayList;
import java.util.List;

public class DfsTraversal {
    public static List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        List<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsUtil(0, adj, visited, dfs);
        return dfs;
    }

    private static void dfsUtil(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> dfs) {
        visited[node] = true;
        dfs.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, adj, visited, dfs);
            }
        }
    }
}
