package OfferHeading_Array;

/*
    ����ת�ַ���

    ��Ŀ����
    �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
    �������ַ���ģ�����ָ���������������һ���������ַ�����S��
    �������ѭ������Kλ������������
    ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ����
    ����XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
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