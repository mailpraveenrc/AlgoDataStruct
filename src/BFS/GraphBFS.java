package BFS;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class GraphBFS {


    private Queue<Node> queue;
    GraphBFS(){
        queue = new ArrayDeque<>();
    }

    public void bfs(Node node) {
        queue.add(node);
        node.visited = true;
        while (!queue.isEmpty()) {

            Node element = queue.remove();
            System.out.print(element.data + " ");
            List<Node> neighbours = element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                Node n = neighbours.get(i);
                if (n != null && !n.visited) {
                    queue.add(n);
                    n.visited = true;

                }
            }

        }
    }

    public static void main(String args[]) {

        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);
        System.out.println("The BFS traversal of the graph is ");
        GraphBFS bfsExample = new GraphBFS();
        bfsExample.bfs(node50);
    }

}