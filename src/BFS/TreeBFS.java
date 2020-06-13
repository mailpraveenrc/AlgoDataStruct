package BFS;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

public class TreeBFS {

    Queue<Tree> queue = new ArrayDeque<>();

    public void bfs(Tree input){
        queue.add(input);
        while (!queue.isEmpty()){
            Tree curr = queue.remove();
            List<Tree> neighbours = curr.neighbours;
            for(Tree node : neighbours){
                queue.add(node);
            }
        }

    }

    public  static void main(String args[]){
        Tree node40 =new Tree(40);
        Tree node50 =new Tree(50);
        Tree node60 =new Tree(60);
        Tree node70 =new Tree(70);
        Tree node80 =new Tree(80);
        Tree node90 =new Tree(90);
        Tree node100 =new Tree(100);

        node40.addneighbours(node50);
        node40.addneighbours(node60);
        node60.addneighbours(node70);
        node60.addneighbours(node80);
        node60.addneighbours(node90);

        node90.addneighbours(node100);

        System.out.println("The BFS traversal of the graph is ");
        System.out.println("------------------");
    }
}
