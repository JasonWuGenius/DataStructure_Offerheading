package OfferHeading_Array;

/*
    左旋转字符串

    题目描述
    汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，
    就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，
    请你把其循环左移K位后的序列输出。
    例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
    即“XYZdefabc”。是不是很简单？OK，搞定它！
 */

import java.util.*;

public class LeftRotateStringSolution {
    public static String LeftRotateString(String str, int n){
        if(str.length() < n){
            return "";
        }
        char[] charArray = str.toCharArray();
        swap(charArray, 0, n-1);
        swap(charArray, n, str.length()-1);
        swap(charArray, 0, str.length()-1);
        return String.valueOf(charArray);
    }
    public static void swap(char[] charArray, int i, int j){
        while(i < j){
                char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        String str = "abcXYZdef";
        System.out.println("String: "+str);
        String newstr = LeftRotateString(str, 3);
        System.out.println("New String: "+newstr);
	}

}