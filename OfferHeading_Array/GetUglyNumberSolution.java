package OfferHeading_Array;

/*
    ??

    ????
    ???????2?3?5???????Ugly Number??
    ??6?8??????14???????????7?
    ??????1????????????????????N????
 */

import java.util.*;

public class GetUglyNumberSolution {
    public static int GetUglyNumber(int index) {
        int i = 2;
        int x2 = 1;
        int x3 = 1;
        int x5 = 1;
        int[] array = new int[index+1];
        array[0] = 0;
        array[1] = 1;
        while(i<=index){
            int min = min(x2*2, x3*3, x5*5);
            array[i] = min;
            if(x2*2<=min){
                x2 = min;
            }
            if(x3*3<=min){
                x3 = min;
            }
            if(x5*5<=min){
                x5 = min;
            }
            i++;
        }
        return array[index];
    }
    public static int min(int x1, int x2, int x3){
        int k = x1<x2? x1:x2;
        return x3<k? x3:k;
    }

    public static void main(String[] args) {
        int index = 10;
        System.out.println("The uglynum in the index: "+GetUglyNumber(index));
	}

}