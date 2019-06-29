package OfferHeading_Array;

/*
    把数组排成最小的数

    题目描述
    输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
    打印能拼接出的所有数字中最小的一个。
    例如输入数组{3，32，321}，则打印出这三个数字能排成
    的最小数字为321323。
 */

import java.util.*;

public class PrintMinNumberSolution {
    public static String PrintMinNumber(int [] numbers) {
        int n = numbers.length;
        List<Integer> list = new ArrayList<>();
        for(int item: numbers){
            list.add(item);
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer str1, Integer str2){
                String s1 = str1+""+str2;
                String s2 = str2+""+str1;
                return s1.compareTo(s2);
            }
        });
        String s = "";
        for(int i:list){
            s+=i;
        }
        return s;
    }
    public static void main(String[] args) {
        int[] numbers = {3,222,321};
        for(int item: numbers){
            System.out.print(item+" ");
        }
        System.out.println("\nThe smallest number is: "+PrintMinNumber(numbers));
    }


}