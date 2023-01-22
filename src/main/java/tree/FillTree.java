package tree;

import java.util.ArrayList;
import java.util.List;

public class FillTree {
    static class NodeTree {
        int value;
        NodeTree left;
        NodeTree right;

        NodeTree(int t) {
            this.value = t;
        }
    }

    int number;
    NodeTree root;
    static int t = 0;


    public static void traverse(NodeTree root, String sp) {
        if (root != null) {
            traverse(root.left, sp + "  ");
            System.out.println(String.format("%s%d", sp, root.value));
            traverse(root.right, sp + "  ");
        }
    }

    static NodeTree buildTree(int n) {
        if (n == 0) {
            return null;
        }
        NodeTree node = new NodeTree(t++);

        node.left = buildTree(n / 2);
        node.right = buildTree(n - n / 2 - 1);
        return node;

    }

    public static void main(String[] args) {
        NodeTree nodeTree = buildTree(8);

        traverse(nodeTree, "");
    }

}
