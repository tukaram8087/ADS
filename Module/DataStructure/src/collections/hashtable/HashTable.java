package collections.hashtable;

public class HashTable {
    private int capacity;
    private int size;
    private LinkedList[] buckets;

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.buckets = new LinkedList[capacity];
        
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList();
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void insert(String key, int value) {
        int index = hash(key);
        LinkedList bucket = buckets[index];
        
        Integer existingValue = bucket.search(key);
        bucket.insert(key, value);
        
        if (existingValue == null) {
            size++;
        }
    }

    public Integer search(String key) {
        int index = hash(key);
        return buckets[index].search(key);
    }

    public boolean delete(String key) {
        int index = hash(key);
        LinkedList bucket = buckets[index];
        
        if (bucket.delete(key)) {
            size--;
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }
}
