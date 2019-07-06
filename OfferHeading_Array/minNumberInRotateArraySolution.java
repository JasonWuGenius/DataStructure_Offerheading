package OfferHeading_Array;

/*
    构建乘积数组

    题目描述
    给定�?个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素
    B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法�??
 */

import java.util.*;

public class BuildMultiplyArray {
    public static int[] multiply(int[] A){
        int length = A.length;
        int[] B = new int[length];  
        if(length != 0){
            B[0] = 1;
            for(int i=1; i<length; i++){
                B[i] = B[i-1] * A[i-1];
            }
            int temp = 1;
            for(int j=length-2; j>=0; j--){
                temp *= A[j+1];
                B[j] *= temp;
            }
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = multiply(A);
        for(int item: B){
            System.out.print(item+" ");
        }
	}

}