package Assignment18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(1);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(4).add(2);

        System.out.println("BFS: " + BfsTraversal.bfsOfGraph(V, adj));
        System.out.println("DFS: " + DfsTraversal.dfsOfGraph(V, adj));
    }
}
