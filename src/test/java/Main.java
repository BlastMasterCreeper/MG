import java.util.*;

public class Main {

    static public void main(String[] args) {
    }

    List<List<Integer>> ans = new LinkedList<>();
    public Deque<Integer> stack = new ArrayDeque<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        stack.offerLast(0);
        DFS(graph, 0, graph.length - 1);
        return ans;
    }

    public void DFS(int graph[][], int x, int n) {
        if (x == n) {
            ans.add(new LinkedList<>(stack));
            return;
        }
        for (int y : graph[x]) {
            stack.offerLast(y);
            DFS(graph, y, n);
            stack.pollLast();
        }
    }

}
