package EncodeAndDecodeStringsLeetCode_271;
import java.util.*;

public class EncodeAndDecodeStrings {

    public static String encode(List<String> strs){
        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            sb.append(str.length()).append("/:").append(str);
        }
        return sb.toString();
    }

    public static List<String> decode(String str){
        List<String> decodedString = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int del = str.indexOf("/:",i);
            int length = Integer.parseInt(str.substring(i,del));
            String str2 = str.substring(del+2,del+2+length);
            decodedString.add(str2);
            i = del+2+length;
        }
        return decodedString;
    }



}
