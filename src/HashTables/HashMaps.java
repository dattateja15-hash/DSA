package HashTables;

import java.util.*;

public class HashMaps {
    // Spell checkers, Dictionaries, Compilers, Code Editors
    // Key - Value pairs
    // EmployeeNumber -> Hash Function -> Address
    // Insert - O(1)
    // LookUp - O(1)
    // Delete - O(1)
    // Sets does not allow duplicate keys.
    // Chaining - Storing each key - value pair in a linked List in each slot.
    // Open Addressing: Probing - Linear Probing If a slot is full we go find and another empty slot.
    // Quadratic probing hash(key) + i^2
    // Double Hashing: hash2(key) = prime - (key % prime)



        private class Entry{
            private int key;
            private String value;

            public Entry(int key,String value){
                this.key = key;
                this.value = value;
            }


        }
        private LinkedList<Entry>[] entries = new LinkedList[5];
        private int hash(int key){
            return key % entries.length;
        }

        public void put(int key,String value){
            var index = hash(key);
            if(entries[index] == null){
                entries[index] = new LinkedList<>();
            }
            var bucket = entries[index];
            for(var entry : bucket){
                if(entry.key == key){
                    entry.value = value;
                    return;
                }
            }

            entries[index].addLast(new Entry(key,value));
        }

        public String get(int key){
            var index = hash(key);
            var bucket = entries[index];
            if(bucket !=null) {
                for (var entry : bucket) {
                    if (entry.key == key) {
                        return entry.value;
                    }
                }
            }
            return null;
        }

        public void remove(int key){
            var index = hash(key);
            var bucket = entries[index];
            if(bucket == null){
                throw new IllegalStateException();
            }
            for(var entry:bucket){
                if(entry.key == key){
                    bucket.remove(entry);
                    return;
                }
            }
            throw new IllegalStateException();
        }




    public static char firstNonRepeatedCharacter(String word){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<word.length();i++){
            if(!map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i), 1);
            }
            else{
                int val = map.get(word.charAt(i));
                map.put(word.charAt(i),val+1);
            }
        }
        System.out.println(map);
        for(var item : map.keySet()){
            var key = item;
            var value = map.get(key);
            if(value == 1){
                return key;
            }
        }
        return ' ';
    }

    public static char firstRepeatedCharacter(String word){
        Set<Character> set = new HashSet<>();
        for(char c:word.toCharArray()){
            if(set.contains(c)){
                return c;
            }
            set.add(c);
        }
        return ' ';
    }

}
