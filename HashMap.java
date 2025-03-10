public class HashMap {
    Entry[] keyToValueMap;
    Entry[] valueToKeyMap; // A second array indexed by hash of value
    
    HashMap(int size) {
        keyToValueMap = new Entry[size];
        valueToKeyMap = new Entry[size];
    }
    
    public class Entry {
        int key;
        String value;
        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    
    private int hashString(String str) {
        // A simple hash function for strings
        int hash = 0;
        for (char c : str.toCharArray()) {
            hash = (hash * 31 + c) % valueToKeyMap.length;
        }
        return hash;
    }
    
    public void add(int key, String value) {
        Entry newEntry = new Entry(key, value);
        keyToValueMap[key] = newEntry;
        
        // Also store in value-to-key map
        int valueHash = hashString(value);
        valueToKeyMap[valueHash] = newEntry;
    }
    
    public int findKey(String value) {
        int valueHash = hashString(value);
        if (valueToKeyMap[valueHash] != null && valueToKeyMap[valueHash].value.equals(value)) {
            return valueToKeyMap[valueHash].key;
        }
        return -1; // Not found
    }
}