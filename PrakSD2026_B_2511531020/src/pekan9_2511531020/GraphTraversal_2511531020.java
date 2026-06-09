package pekan9_2511531020;
import java.util.*;

public class GraphTraversal_2511531020 {
    private Map<String, List<String>> graph_1020 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge_1020(String node1_1020, String node2_1020) {
        graph_1020.putIfAbsent(node1_1020, new ArrayList<>());
        graph_1020.putIfAbsent(node2_1020, new ArrayList<>());
        graph_1020.get(node1_1020).add(node2_1020);
        graph_1020.get(node2_1020).add(node1_1020);
    }

    // Menampilkan graf awal
    public void printGraph_1020() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node_1020 : graph_1020.keySet()) {
            System.out.print(node_1020 + " -> ");
            List<String> neighbors_1020 = graph_1020.get(node_1020);
            System.out.println(String.join(", ", neighbors_1020));
        }
        System.out.println();
    }

    // DFS rekursif
    public void dfs_1020(String start_1020) {
        Set<String> visited_1020 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper_1020(start_1020, visited_1020);
        System.out.println();
    }

    private void dfsHelper_1020(String current_1020, Set<String> visited_1020) {
        if (visited_1020.contains(current_1020)) return;
        visited_1020.add(current_1020);
        System.out.print(current_1020 + " ");
        for (String neighbor_1020 : graph_1020.getOrDefault(current_1020, new ArrayList<>())) {
            dfsHelper_1020(neighbor_1020, visited_1020);
        }
    }

//BFS iteratif
public void bfs_1020(String start_1020) {
 Set<String> visited_1020 = new HashSet<>();
 Queue<String> queue_1020 = new LinkedList<>();
 queue_1020.add(start_1020);
 visited_1020.add(start_1020);
 System.out.println("Penelusuran BFS:");
 while (!queue_1020.isEmpty()) {
     String current_1020 = queue_1020.poll();
     System.out.print(current_1020 + " ");
     for (String neighbor_1020 : graph_1020.getOrDefault(current_1020, new ArrayList<>())) {
         if (!visited_1020.contains(neighbor_1020)) {
             queue_1020.add(neighbor_1020);
             visited_1020.add(neighbor_1020);
         }
     }
 }
 System.out.println();
}

//Main
public static void main(String[] args) {
 GraphTraversal_2511531020 graph_1020 = new GraphTraversal_2511531020();

 // Contoh graf: A-B, A-C, B-D, B-E
 graph_1020.addEdge_1020("A", "B");
 graph_1020.addEdge_1020("A", "C");
 graph_1020.addEdge_1020("B", "D");
 graph_1020.addEdge_1020("B", "E");

 // Cetak graf awal
 System.out.println("Graf Awal adalah: ");
 graph_1020.printGraph_1020();

 // Lakukan penelusuran
 graph_1020.dfs_1020("A");
 graph_1020.bfs_1020("A");
}
}
