package OfferHeading_Array;

/*
    和为S的两个数字

    题目描述
    输入一个递增排序的数组和一个数字S，在数组中查找两个数，
    使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
    输出描述:
    对应每个测试案例，输出两个数，小的先输出。
 */

import java.util.ArrayList;
public class FindNumbersWithSumSolution {
    //因为已经排好顺序了，所以从左右一直不断逼近中心点，就可以得到成绩最近的两个数。
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if(array.length < 2 || array == null){
            return list;
        }
        int i=0, j=array.length-1;
        while(i<j){
            if(array[i]+array[j] == sum){
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }
            else if(array[i]+array[j]>sum){
                j--;
            }
            else{
                i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,12,20};
        int sum = 5;
        System.out.println("The result list: "+FindNumbersWithSum(array, sum));

	}

}