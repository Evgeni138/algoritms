package hW4HashFunction;

public class Program {
    public static void main(String[] args) {
        Node node1 = new Node("Kate", 123456);
        Node node2 = new Node("Tom", 323456);
        Node node3 = new Node("Alyse", 133356);
        Node node4 = new Node("April", 223356);

        NodeList nodeList1 = new NodeList();

        nodeList1.addNode(node1);
        nodeList1.addNode(node2);
        nodeList1.addNode(node3);
        nodeList1.addNode(node4);

        nodeList1.printAll();

        System.out.println();

        HashTable hashTable = new HashTable();

        NodeList[] resultHashTable = hashTable.fillHashTable(nodeList1);

        hashTable.printAllElementsHashTable(resultHashTable);

        System.out.println();

        hashTable.findContact("Tomb", resultHashTable);
    }
}
