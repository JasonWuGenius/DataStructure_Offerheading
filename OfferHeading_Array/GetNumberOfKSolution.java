package OfferHeading_Array;

/*
    数字在排序数组中出现的次数

    题目描述
    统计一个数字在排序数组中出现的次数。
 */

import java.util.ArrayList;
public class GetNumberOfKSolution {
    public static int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0){
            return 0;
        }
        int l = 0;
        int r = array.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(array[mid] < k){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        int first = l;
        l = 0;
        r = array.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(array[mid] > k){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        int last = r;
        return last-first+1;
        
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,4,5,6,7};
        int k = 4;
        System.out.println("The num of K: "+GetNumberOfK(array, k));

	}

}