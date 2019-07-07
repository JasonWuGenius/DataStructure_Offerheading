package OfferHeading_Array;

/*
    ?????????

    ????
    ????????????????????????????????? 
    ????????????????????????????? 
    ????{3,4,5,1,2}?{1,2,3,4,5}??????
    ????????1? NOTE???????????0???????0????0?


    ??????
    ????????????
    mid = low + (high - low)/2
    ?????????
    (1)array[mid] > array[high]:
    ???????array??[3,4,5,6,0,1,2]??????????mid????
    low = mid + 1
    (2)array[mid] == array[high]:
    ???????array?? [1,0,1,1,1] ??[1,1,1,0,1]????????????mid??
    ????,????????? ?
    high = high - 1
    (3)array[mid] < array[high]:
    ???????array??[2,2,3,4,5,6,6],??????????array[mid]???mid??
    ??????????????
    high = mid
    ??????????????????????????mid ????????????
    ?? array = [4,6]
    array[low] = 4 ;array[mid] = 4 ; array[high] = 6 ;
    ??high = mid - 1???????? ??high = mid
    ???(1)?low = mid + 1?????
 */

import java.util.*;

public class minNumberInRotateArraySolution {
    public static int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }
        if(array.length == 1){
            return array[0];
        }
        for(int i=0; i<array.length-1; i++){
            if(array[i] > array[i+1]){
                return array[i+1];
            }
            else{
                if(i == array.length-2){
                    return array[0];
                }
            }
        }
        return 0;
    }

    public static int minNumberInRotateArray1(int[] array){
        int low = 0, high = array.length-1;
        while(low < high){
            int mid = (low + high)/2;
            if(array[mid]>array[high]){
                low = mid+1;
            }
            else if(array[mid] == array[high]){
                high = high-1;
            }
            else{
                high = mid;
            }
        }
        return array[low];
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 1, 2, 3};
        for(int item: array){
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println("The Minimum Num in Array: "+minNumberInRotateArray(array));
        System.out.println("The Minimum Num in Array: "+minNumberInRotateArray1(array));
	}

}