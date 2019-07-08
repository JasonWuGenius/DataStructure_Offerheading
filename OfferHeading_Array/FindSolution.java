package OfferHeading_Array;

/*
    二维数组中的查找

    题目描述
    在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
    每一列都按照从上到下递增的顺序排序。请完成一个函数，
    输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

import java.util.*;

public class FindSolution {
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0){
            return false;
        }
        int m = 0;
        int n = array.length-1;
        while(m<array.length && n>=0){
            if(array[m][n] < target){
                m++;
            }
            else if(array[m][n] > target){
                n--;
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
	}

}