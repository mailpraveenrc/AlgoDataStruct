package BFS;

import javax.swing.text.html.Option;
import java.util.*;

public class Tree {

    int data;
    List<Tree> neighbours;

    Tree(int data)
    {
        this.data=data;
        this.neighbours=new ArrayList<>();
    }

    public void addneighbours(Tree neighbourNode)
    {
        this.neighbours.add(neighbourNode);
    }

    public List<Tree> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Tree> neighbours) {
        this.neighbours = neighbours;
    }
}
