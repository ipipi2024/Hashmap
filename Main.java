public class Main {
    public static void main(String[] args) {
        HashMap map = new HashMap(10);
        map.addEntry(0, "Tom");
        map.addEntry(1, "John");
        map.addEntry(2, "James");
        map.addEntry(3, "Lil");
        map.addEntry(4, "Chris");
        map.addEntry(7, "chris");

        System.out.println(map.getHasString("Chris"));
        System.out.println(map.valueToKeyMap[5].head.value);
        System.out.println(map.valueToKeyMap[5].head.key);
        System.out.println(map.valueToKeyMap[5].head.next.value);
        System.out.println(map.valueToKeyMap[5].head.next.key);
        
        
    }
}