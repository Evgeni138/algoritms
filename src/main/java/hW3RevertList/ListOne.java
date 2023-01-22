package hW3RevertList;
// Односвязанный список
public class ListOne {
    NodeOne head;

    // Добавление элемента
    public void push(int value) {
        NodeOne node = new NodeOne();
        node.value = value;
        node.next = head;
        head = node;
    }

    // Вывод всех эдементов в консоль
    public void printAll() {
        NodeOne nodeOne = head;
        while (nodeOne != null) {
            System.out.println(nodeOne.value);
            nodeOne = nodeOne.next;
        }
    }

    // Рекурсивный разворот
    public void revert() {
        if (head != null && head.next != null) {
            NodeOne temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }


    // Разворот через создание нового списка
    public ListOne revert2() {
        NodeOne node = new NodeOne();
        ListOne newList = new ListOne();
        node = head;
        while (node != null) {
            newList.push(node.value);
            node = node.next;
        }
        return newList;
    }

    private void revert(NodeOne currentNode, NodeOne previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }
}
