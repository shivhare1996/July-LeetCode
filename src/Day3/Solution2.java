package Day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Date 03/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/prison-cells-after-n-days/
 *
 */
public class Solution2 {
    public int[] prisonAfterNDays(int[] cells, int N) {
        Set<String> travel = new HashSet<>();
        int[] clone = cells.clone();
        for(int i =0; i<N; i++){
            afterOneDay(cells);
            String current = Arrays.toString(cells);
            if(travel.contains(current)){
                break;

            }else{
                travel.add(current);
            }

        }

        if(travel.size() == N){
            return cells;
        }else{
            N--;
            afterOneDay(clone);
            N = N % travel.size();
            for(int i = 0; i<N; i++){
                afterOneDay(clone);
            }
            return clone;
        }

    }

    public void afterOneDay(int[] cells){
        int[] clone = cells.clone();
        for(int i = 0; i<8; i++){
            if(i ==0 || i ==7){
                cells[i] = 0;
            }else{
                cells[i] = (clone[i-1]^clone[i+1]) == 0? 1: 0;
            }
        }
    }
}
