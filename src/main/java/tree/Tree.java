package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    Node root;

    public boolean existDeep(int value) {
        if (root != null) {
            Node node = findDeep(root, value);
            if (node != null) {
                return true;
            }
        }
        return false;
    }

    private Node findDeep(Node node, int value) {
        if (node.value == value) {
            return node;
        } else {
            for (Node child: node.children) {
                Node result = findDeep(child, value);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    private Node findWidth(int value) {
        List<Node> line = new ArrayList<>();
        line.add(root);
        while (line.size() > 0) {
            List<Node> nextLine = new ArrayList<>();
            for (Node node: line) {
                if (node.value == value) {
                    return node;
                } else nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }
}
