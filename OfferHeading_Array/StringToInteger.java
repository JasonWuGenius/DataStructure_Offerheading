package OfferHeading_Array;

/*
    把字符串转换成整数

    题目描述
    将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
    输入描述:
    输入一个字符串,包括数字字母符号,可以为空
    输出描述:
    如果是合法的数值表达则返回该数字，否则返回0
    示例1
    输入
    复制
    +2147483647
        1a33
    输出
    复制
    2147483647
    0
 */

import java.util.*;

public class StringToInteger {
    public static int StrToInt(String str) {
        if(str.length() == 0 || str.equals("")){
            return 0;
        }
        char[] a = str.toCharArray();
        int fuhao = 0;
        if(a[0] == '-'){
            fuhao = 1;
        }
        int sum = 0;
        for(int i=fuhao; i<str.length(); i++){
            if(a[i] == '+'){
                continue;
            }
            if(a[i]<48 || a[i]>57){
                return 0;
            }
            sum += sum*10 + a[i] - 48;
        }
        return fuhao==0? sum: sum*-1;

    }

    public static void main(String[] args) {
        String s = "+56e78";
        int res = StrToInt(s);
        System.out.println("s: "+s);
        System.out.println("res: "+res);
	}

}