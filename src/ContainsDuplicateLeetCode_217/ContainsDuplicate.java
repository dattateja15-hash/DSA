package ContainsDuplicateLeetCode_217;
import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

}
