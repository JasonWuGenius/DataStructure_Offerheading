package OfferHeading_Array;

/*
    �ַ����е�һ�����ظ����ַ�

    ��Ŀ����
    ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
    ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
    �������:
    �����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
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