package Day11;

public class Main {
    public static void main(String[] args) {
        Node list1 = null;
        list1 = DoublyLinkedList.insert(list1, 1);
        list1 = DoublyLinkedList.insert(list1, 3);
        list1 = DoublyLinkedList.insert(list1, 5);

        Node list2 = null;
        list2 = DoublyLinkedList.insert(list2, 2);
        list2 = DoublyLinkedList.insert(list2, 4);
        list2 = DoublyLinkedList.insert(list2, 6);

        Node mergedHead = DoublyLinkedList.mergeSortedLists(list1, list2);
        DoublyLinkedList.printList(mergedHead);

        Node list3 = null;
        int[] arr = {1, 2, 3, 4, 5};
        for (int val : arr) {
            list3 = DoublyLinkedList.insert(list3, val);
        }

        list3 = DoublyLinkedList.pairwiseSwap(list3);
        DoublyLinkedList.printList(list3);

        ArrayDequeCustom deque = new ArrayDequeCustom(5);
        deque.addLast(10);
        deque.addLast(20);
        deque.addFront(5);
        deque.addFront(2);
        deque.display();

        deque.deleteFront();
        deque.deleteLast();
        deque.display();

        deque.addFront(1);
        deque.addLast(30);
        deque.display();
    }
}