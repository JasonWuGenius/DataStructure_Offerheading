package OfferHeading_Array;

/*
    最小的K个数

    题目描述
    输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，
    则最小的4个数字是1,2,3,4,。

    思路：
    这里主要是基于堆排序思想的找出最大的K个数字
 */


import java.util.*;

public class GetLeastNumbersSolution1 {
    public static ArrayList<Integer> GetLeastNumbers(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input == null || k<=0 || k>input.length){
            return list;
        }
        int[] numbers = new int[k];
        for(int i=0; i<k; i++){
            //放入最小的K个数
            numbers[i] = input[i];
        }
        for(int i=k/2-1; i>=0; i--){
            // 将数组构造成最大堆的形式
            adjustHeap(numbers, i, k-1);
        }
        for(int i=k; i<input.length; i++){
            if(input[i] < numbers[0]){
                numbers[0] = input[i];
                adjustHeap(numbers, 0, k-1);
            }
        }
        for(int n: numbers){
            list.add(n);
        }
        return list;
    }
    public static void adjustHeap(int[] array, int start, int end){
        int temp = array[start];
        int child = start*2+1;
        while(child<=end){
            if(child+1<=end && array[child+1]>array[end]){
                child++;
            }
            if(array[child]<temp){
                break;
            }
            array[start] = array[child];
            start = child;
            child = child*2+1;
        }
        array[start] = temp;
    }

    public static void main(String[] args) {
        int[] input = {4,5,1,6,2,7,3,8};
        int k = 4;
        System.out.println("The List:");
        for(int item: input){
            System.out.print(item+" ");
        }
        System.out.printf("\nThe Least Num of %d is %s", k, GetLeastNumbers(input, k));
	}

}