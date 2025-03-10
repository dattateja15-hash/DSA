import HashTables.HashMaps;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(HashMaps.firstRepeatedCharacter("a green apple"));
        HashMaps table = new HashMaps();
        table.put(6,"A");
        table.put(8,"B");
        table.put(11,"C");
        table.put(6,"A+");
        table.remove(6);
        System.out.println("Done");
        }

}