package LongestConsecutiveSequence_128;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConscutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int longestStreak = 1;
        int currentStreak = 1;
        for(int i = 1;i< nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                currentStreak+=1;
            }
            else{
                longestStreak = Math.max(currentStreak,longestStreak);
                currentStreak = 1;
            }
        }
        return Math.max(longestStreak,longestStreak);
    }

    public static int longestConsecutiveOptimized(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> numSet = new HashSet<>();
        for(int i = 0;i< nums.length;i++){
            numSet.add(nums[i]);
        }
        int longestStreak = 0;
        for(int i = 0;i<nums.length;i++){
            if(!numSet.contains(nums[i]-1)){
                int lenght = 0;
                while(numSet.contains(nums[i]+lenght)){
                    lenght+=1;
                }
                longestStreak = Math.max(lenght,longestStreak);
            }
        }
        return longestStreak;
    }

}
