package ValidSudokoLeetCode_36;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public static boolean isValidSudoko(char[][] board){
        int N = 9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];
        for(int i = 0;i<N;i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int r = 0;r<N;r++){
            for(int c = 0;c<N;c++){
                char value = board[r][c];
                if(value=='.'){
                    continue;
                }
                if(rows[r].contains(value)){
                    return false;
                }
                rows[r].add(value);
                if(cols[c].contains(value)){
                    return false;
                }
                cols[c].add(value);
                int indx = (r/3)*3+(c/3);
                if(boxes[indx].contains(value)){
                    return false;
                }
                boxes[indx].add(value);
            }
        }
        return true;

    }

}
