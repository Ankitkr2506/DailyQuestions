import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class bfs {
     static ArrayList <Integer> levelOrder(Node root) 
    {   
        ArrayList <Integer> ans=new ArrayList<>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
 
            // poll() removes the present head.  
            Node tempNode = queue.poll();
            ans.add(tempNode.data);
 
            // Enqueue left child
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
 
            // Enqueue right child
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
        return ans;
    }
}
