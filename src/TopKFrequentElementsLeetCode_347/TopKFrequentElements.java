package TopKFrequentElementsLeetCode_347;

import java.util.*;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] list = new List[nums.length+1];
        for(int i = 0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(var entry:map.entrySet()){
            if(list[entry.getValue()]==null){
                list[entry.getValue()] = new ArrayList<>();
            }
            list[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int counter = 0;
        for(int i = list.length-1;i>=0 && counter<k;i--){
            if(list[i]!=null){
                for(var j :list[i]){
                    res[counter++] = j;
                }
            }
        }
        return res;
    }

}
