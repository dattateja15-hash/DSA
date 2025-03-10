package GroupAnagramsLeetCode_49;
import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            String temp = s;
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            temp = new String(arr);
            if(!map.containsKey(temp)){
                map.put(temp,new ArrayList<>());
            }
            map.get(temp).add(s);
        }
        System.out.println(map);
        for(var set:map.entrySet()){
            result.add(set.getValue());
        }
        return result;
    }

    //["eat","tea","tan","ate","nat","bat"]

    public static List<List<String>> groupAnagramsOptimized(String[] strs){
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] arr = new int[26];
            for(char c:s.toCharArray()){
                arr[c-'a']++;

            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<26;i++){
                sb.append(arr[i]).append('#');
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new LinkedList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }



}
