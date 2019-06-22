package OfferHeading_Array;

/*
    ?????????

    ????
    ??????????????????????????????????????????????
    ??????{3?32?321}???????????????????321323?
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