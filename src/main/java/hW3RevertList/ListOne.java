package hW3RevertList;
// Односвязанный список
public class ListOne {
    NodeOne head;

    public void push(int value) {
        NodeOne node = new NodeOne();
        node.value = value;
        node.next = head;
        head = node;
    }

    public void printAll() {
        NodeOne nodeOne = head;
        while (nodeOne != null) {
            System.out.println(nodeOne.value);
            nodeOne = nodeOne.next;
        }
    }


}
