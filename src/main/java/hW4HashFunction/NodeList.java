package hW4HashFunction;

import java.util.ArrayList;

public class NodeList {
    ArrayList<Node> nodeArrayList = new ArrayList<>();

    public NodeList() {}

    public void addNode(Node node) {
        nodeArrayList.add(node);
    }

    public void printAll() {
        for (Node i: nodeArrayList) {
            System.out.println(i.name + " " + i.tel);
        }
    }

}
