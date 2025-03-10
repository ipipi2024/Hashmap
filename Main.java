public class Main {
    public static void main(String[] args) {
        // Create a new HashMap with size 100
        HashMap map = new HashMap(100);
        
        // Add some key-value pairs
        map.add(5, "apple");
        map.add(10, "banana");
        map.add(15, "orange");
        map.add(20, "grape");
        map.add(25, "watermelon");
        
        // Test finding keys by value
        String[] valuesToFind = {"apple", "banana", "orange", "grape", "watermelon", "pineapple"};
        
        for (String value : valuesToFind) {
            int key = map.findKey(value);
            if (key != -1) {
                System.out.println("Value '" + value + "' found with key: " + key);
            } else {
                System.out.println("Value '" + value + "' not found in the HashMap");
            }
        }
    }
}