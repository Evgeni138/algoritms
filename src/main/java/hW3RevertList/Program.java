package hW3RevertList;

public class Program {
    public static void main(String[] args) {
        List list1 = new List();
        list1.push(1);
        list1.push(2);
        list1.push(3);
        list1.push(4);
        list1.push(5);
        list1.printAll();
        System.out.println();
        list1 = list1.revert();
        list1.printAll();
        System.out.println();
        list1.revert2();
        list1.printAll();
    }
}
