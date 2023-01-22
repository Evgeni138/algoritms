package hW3RevertList;
// Двусвязанный список
public class List {
    Node head;
    Node tail;
    Node next;

    // Добавлнение элемента с головы
    public void push(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.previous = node;
            head = node;
        }
    }


    // Добавление элемента с конца
    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    // Вывод в клнсоль всех элементов
    public void printAll() {
        Node node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    // Разворот элементов через создание нового списка
    public List revert() {
        List newList = new List();
        Node node = head;
        while (node != null) {
            newList.push(node.value);
            node = node.next;
        }
        return newList;
    }

    // Рекурсивный разворот
    public void revert2() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }
}
