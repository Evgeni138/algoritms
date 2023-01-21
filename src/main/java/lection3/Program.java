package lection3;

public class Program {
    public static void main(String[] args) {
        OneList oneList = new OneList();
        oneList.push(1);
        oneList.push(2);
        oneList.push(3);
        oneList.push(4);
        oneList.push(0);
        System.out.println(oneList);
        oneList.printAll();

        System.out.println();

        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.push(0);
        list.printAll();

    }
}
