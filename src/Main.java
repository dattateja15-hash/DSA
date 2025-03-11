

import EncodeAndDecodeStringsLeetCode_271.EncodeAndDecodeStrings;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        ls.add("Datta");
        ls.add("Tej/a");
        ls.add("Nall/:uri");
        var str = EncodeAndDecodeStrings.encode(ls);
        System.out.println(str);
        System.out.println(EncodeAndDecodeStrings.decode(str));
    }

}