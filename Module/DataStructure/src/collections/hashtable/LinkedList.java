package collections.hashtable;

class Node {
    String key;
    int value;
    Node next;

    public Node(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(String key, int value) {
        Node current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        
        // Add new node at the beginning of the list
        Node newNode = new Node(key, value);
        newNode.next = head;
        head = newNode;
    }

    // Searches for a key and returns its value, or throws an exception / returns a default if not found
    public Integer search(String key) {
        Node current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // Not found
    }

    // Deletes a node with the given key. Returns true if successful, false otherwise.
    public boolean delete(String key) {
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    head = current.next; // Removing the head node
                }
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }
}
