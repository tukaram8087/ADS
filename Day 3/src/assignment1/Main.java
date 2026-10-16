package assignment1;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(20);
        list.insert(40);
        list.insert(20);

        System.out.println("Original list:");
        list.display();

        list.delete(20);
        System.out.println("After delete(20):");
        list.display();

        System.out.println("Search 30: " + list.search(30));
        System.out.println("Search 50: " + list.search(50));

        list.deleteAll(20);
        System.out.println("After deleteAll(20):");
        list.display();
    }
}
