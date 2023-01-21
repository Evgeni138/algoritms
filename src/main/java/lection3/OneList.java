package lection3;

public class OneList {
    NodeOne head;

    class NodeOne {
        int value;
        NodeOne next;
    }

    public void push(int value) {
        NodeOne node = new NodeOne();
        node.value = value;
        node.next = head;
        head = node;
    }

    public Integer pop() {
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public void revert() {
        if (head != null && head.next != null) {
            revert(head.next, head);
        }
    }

    private void revert(NodeOne currentNode, NodeOne previousNode) {
        if (currentNode.next == null) {
            NodeOne temp = head;
            head = currentNode;
            temp.next = null;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
//        previousNode.next = null;
    }

    public void printAll() {
        NodeOne node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    @Override
    public String toString() {
        return "OneList{" +
                "head=" + head.value +
                '}';
    }
}
