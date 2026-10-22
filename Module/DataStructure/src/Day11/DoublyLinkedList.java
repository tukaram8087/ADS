package Day11;

public class DoublyLinkedList {

    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " <-> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node mergeSortedLists(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node head;
        Node tail;

        if (head1.data <= head2.data) {
            head = head1;
            head1 = head1.next;
        } else {
            head = head2;
            head2 = head2.next;
        }

        tail = head;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1.prev = tail;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2.prev = tail;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        if (head1 != null) {
            tail.next = head1;
            head1.prev = tail;
        } else if (head2 != null) {
            tail.next = head2;
            head2.prev = tail;
        }

        return head;
    }

    public static Node pairwiseSwap(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node newHead = head.next;

        while (current != null && current.next != null) {
            Node first = current;
            Node second = current.next;

            Node prevNode = first.prev;
            Node nextNode = second.next;

            second.next = first;
            first.prev = second;

            first.next = nextNode;
            if (nextNode != null) {
                nextNode.prev = first;
            }

            second.prev = prevNode;
            if (prevNode != null) {
                prevNode.next = second;
            }

            current = first.next;
        }

        return newHead;
    }
}