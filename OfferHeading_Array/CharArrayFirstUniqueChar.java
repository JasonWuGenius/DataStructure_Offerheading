package OfferHeading_Array;

/*
    字符流中第一个不重复的字符

    题目描述
    请实现一个函数用来找出字符流中第一个只出现一次的字符。
    例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
    输出描述:
    如果当前字符流没有存在出现一次的字符，返回#字符。
 */

import java.util.*;

public class CharArrayFirstUniqueChar {
    int index = 1;
    int[] count = new int[256];
    public void Insert(char ch){
        if(count[ch] == 0){
            count[ch] = index++;
        }
        else{
            count[ch] = -1;
        }
    }
    public char FirstAppearanceOnce(){
        int temp = Integer.MAX_VALUE;
        char ch = '#';
        for(int i=0; i<count.length; i++){
            if(count[i]!=0 && count[i]!=-1 && count[i]<temp){
                temp = count[i];
                ch = (char)i;
            }
        }
        return ch;
    }

    public static void main(String[] args) {
		CharArrayFirstUniqueChar cf = new CharArrayFirstUniqueChar();
		cf.Insert('g');
		cf.Insert('o');
		cf.Insert('o');
		cf.Insert('g');
		cf.Insert('l');
		cf.Insert('e');
		System.out.println("First Unique Char: "+cf.FirstAppearanceOnce());
	}

}