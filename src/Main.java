import Arrays.Array;
import GroupAnagramsLeetCode_49.GroupAnagrams;
import TwoSumLeetCode_1.TwoSum;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{2,7,11,15},9)));
        GroupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(GroupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        GroupAnagrams.groupAnagrams(new String[]{""});
        }

}