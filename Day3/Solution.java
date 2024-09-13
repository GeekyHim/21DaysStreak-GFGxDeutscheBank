package Day3;
public class Solution {
    class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
}

class Mirror {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        if (node == null) {
            return;
        }
        
        // Recursively convert left and right subtrees
        mirror(node.left);
        mirror(node.right);
        
        // Swap the left and right children of the current node
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
}
