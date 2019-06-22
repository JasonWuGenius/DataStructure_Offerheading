package OfferHeading_Array;

/*
    ???????

    ????
    ??????????????????????????????????????????????,??????????????P???P?1000000007???????? ???P%1000000007
    ????:
    ??????????????????

    ?????

        ??%50???,size<=10^4

        ??%75???,size<=10^5

        ??%100???,size<=2*10^5

    ??1
    ??
    ??
    1,2,3,4,5,6,7,0
    ??
    ??
    7
 */

import java.util.*;

public class InversePairsSolution {
    public static int InversePairs(int [] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        int count = getCount(array, 0, array.length-1);
        return count;
    }
    public static int getCount(int[] array, int start, int end){
        if(start >= end){
            return 0;
        }
        int mid = (end+start)/2;
        int left = getCount(array, start, mid);
        int right = getCount(array, mid+1, end);

        // ??
        int count = 0;
        int i = mid;
        int j = end;
        int[] temp = new int[end-start+1];
        int k = end-start;
        while(i>=start && j>=mid+1){
            if(array[i]>array[j]){
                count+=(j-mid);
                temp[k--] = array[i--];
            }
            else{
                temp[k--] = array[j--];
            }
        }
        while(i>=start){
            temp[k--] = array[i--];
        }
        while(j>=mid+1){
            temp[k--] = array[j--];
        }
        for(k=0; k<temp.length; k++){
            array[k+start] = temp[k];
        }
        return count+left+right;
    }

    public static void main(String[] args) {
        int[] array = { 4, 5, 1, 2, 3};
        for(int item: array){
            System.out.print(item+" ");
        }
        System.out.println("\nThe result of inversePairs: "+InversePairs(array));
	}

}