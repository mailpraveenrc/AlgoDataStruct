package BFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {

    int data;
    boolean visited;
    List<Node> neighbours;

    Node(int data)
    {
        this.data=data;
        this.neighbours=new ArrayList<>();
    }

    public void addneighbours(Node neighbourNode)
    {
        this.neighbours.add(neighbourNode);
    }

    public List<Node> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Node> neighbours) {
        this.neighbours = neighbours;
    }

}
