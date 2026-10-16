package assignment2;

public class DoublyLinkedList {
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
        newNode.prev = temp;
    }

    public boolean search(int element) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == element) return true;
            temp = temp.next;
        }
        return false;
    }

    // Deletes only the first occurrence.
    public void delete(int element) {
        Node temp = head;
        while (temp != null && temp.data != element) {
            temp = temp.next;
        }
        if (temp == null) return;

        if (temp.prev == null) {
            head = temp.next;
        } else {
            temp.prev.next = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    public void deleteAll(int element) {
        Node temp = head;
        while (temp != null) {
            Node nextNode = temp.next;
            if (temp.data == element) {
                if (temp.prev == null) {
                    head = temp.next;
                } else {
                    temp.prev.next = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
            }
            temp = nextNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void displayBackward() {
        if (head == null) {
            System.out.println("NULL");
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }
}
