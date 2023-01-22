package hW3RevertList;
// Необходимо реализовать метод разворота связного списка
public class Program {
    public static void main(String[] args) {
        List list1 = new List();
        list1.push(1);
        list1.push(2);
        list1.push(3);
        list1.push(4);
        list1.push(5);
        System.out.println("Двусвязный список: ");
        list1.printAll();
        System.out.println("Разворот через создание нового списка");
        list1 = list1.revert();
        list1.printAll();
        System.out.println("Рекурсивный разворот");
        list1.revert2();
        list1.printAll();

        System.out.println();

        ListOne listOne = new ListOne();
        listOne.push(1);
        listOne.push(2);
        listOne.push(3);
        listOne.push(4);

        System.out.println("Односвязанный список: ");
        listOne.printAll();
        System.out.println("Рекурсивный разворот");
        listOne.revert();
        listOne.printAll();
        System.out.println("Разворот через создание нового списка");
        listOne = listOne.revert2();
        listOne.printAll();
    }
}
