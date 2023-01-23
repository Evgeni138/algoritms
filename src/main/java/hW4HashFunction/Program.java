package hW4HashFunction;
// Написать любую хэш-функцию
public class Program {
    public static void main(String[] args) {
        // Создаем ноды и список нодов, аналог коллекции ключ-значение
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
        // Создание объекта хэш-таблицы
        HashTable hashTable = new HashTable();
        // Заполнение хнш-таблицы
        NodeList[] resultHashTable = hashTable.fillHashTable(nodeList1);
        // Вывод всех элементов хэш-таблицы
        hashTable.printAllElementsHashTable(resultHashTable);

        System.out.println();
        // Поиск контакта в хэш-таблице по ключу
        hashTable.findContact("Alyse", resultHashTable);
    }
}
