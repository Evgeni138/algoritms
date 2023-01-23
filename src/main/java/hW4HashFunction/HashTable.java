package hW4HashFunction;
// Описание класса HashTable, в котором происходит заполнение и обрабока хэш-таблицы
public class HashTable {

    // Описывается хэш-функция, с помощью которой вычисляется индекс массива для заполнения хэш-таблицы
    public int hashFunction(int count, Node node) {
        int total = 0;
        String[] arr = node.name.split("");
        for (String symbol : arr) {
            total += symbol.hashCode();
        }
        return total % count;
    }

    // Функция, которая заполняет хэш-табдицу
    public NodeList[] fillHashTable(NodeList nodeList) {
        NodeList[] filledHashTable = new NodeList[nodeList.nodeArrayList.size()];
        for (Node node : nodeList.nodeArrayList) {
            int index = hashFunction(nodeList.nodeArrayList.size(), node);
            if (filledHashTable[index] == null) {
                filledHashTable[index] = new NodeList();
            }
            filledHashTable[index].addNode(node);
        }
        return filledHashTable;
    }

    // Функция вывода в консоль всех элементов хэш-таблицы
    public void printAllElementsHashTable(NodeList[] hashTable) {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != null) {
                for (Node node : hashTable[i].nodeArrayList) {
                    System.out.println(i + " " + node.name + " " + node.tel);
                }
            }
        }
    }

    // Функция поиска элемента в хэш-таблице по ключу
    public void findContact(String name, NodeList[] hashTable) {
        int index = 0;
        boolean flag = false;
        String[] str = name.split("");
        for (String i: str) {
            index += i.hashCode();
        }
        index = index % hashTable.length;
        for (Node node: hashTable[index].nodeArrayList) {
            if (node.name == name) {
                System.out.println(index + " " + node.name + " " + node.tel);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Do not have this contact!");
        }
    }
}
