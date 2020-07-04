package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date 04/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/ugly-number-ii/
 *
 */

public class Solution2 {

    public int nthUglyNumber(int n) {
        if(n ==0 ||n == 1)
            return n;

        List<Long> mainList = new ArrayList<>();
        List<Long> currentList = new ArrayList<>();
        mainList.add(1L);

        for(int i=0; i<n-1; i++){
            currentList.clear();
            currentList.addAll(Arrays.asList(2*mainList.get(i), 3*mainList.get(i), 5*mainList.get(i)));
            merge(mainList, currentList, i+1);
        }

        return mainList.get(n-1).intValue();
    }


    public void merge(List<Long> listOne, List<Long>listTwo, int index){

        listTwo.removeAll(listOne);
        int k =0;
        int i;
        for( i = index; k<listTwo.size() && i< listOne.size()-1; i++){
            if(listTwo.get(k) < listOne.get(i+1) && listTwo.get(k) > listOne.get(i) ){
                listOne.add(i+1, listTwo.get(k++));
            }
        }

        if(i >= listOne.size()-1 && k<listTwo.size()){
            while(k<listTwo.size()){
                listOne.add(listTwo.get(k++));
            }
        }
    }



}
