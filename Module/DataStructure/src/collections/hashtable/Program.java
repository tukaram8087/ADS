package collections.hashtable;

public class Program {
    public static void main(String[] args) {
        HashTable ht = new HashTable(5);

        ht.insert("apple", 100);
        ht.insert("banana", 200);
        ht.insert("grape", 300);

        System.out.println("apple: " + ht.search("apple"));       
        System.out.println("banana: " + ht.search("banana"));    

        ht.insert("apple", 150);
        System.out.println("Updated apple: " + ht.search("apple")); 

        ht.delete("banana");
        System.out.println("banana after deletion: " + ht.search("banana")); 

        System.out.println("Table size: " + ht.size());          
    }
}
