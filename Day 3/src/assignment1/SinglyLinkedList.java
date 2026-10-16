package assignment1;

public class SinglyLinkedList {
    Node head;

    public void insert(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Deletes only the first occurrence.
    public void delete(int element) {
        if (head == null) return;

        if (head.data == element) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == element) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    // Deletes every occurrence.
    public void deleteAll(int element) {
        while (head != null && head.data == element) {
            head = head.next;
        }

        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.data == element) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    public boolean search(int element) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == element) return true;
            temp = temp.next;
        }
        return false;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
