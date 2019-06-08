package OfferHeading_Dynamic;

/*
	�����е�·��

	��Ŀ����
	�����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����·�����ԴӾ����е�����һ�����ӿ�ʼ��ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ����һ��·�������˾����е�ĳһ�����ӣ���֮�����ٴν���������ӡ� ���� a b c e s f c s a d e e ������3 X 4 �����а���һ���ַ���"bcced"��·�������Ǿ����в�����"abcb"·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���ø��ӡ�
*/

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(size == 0 || num.length < size){
            return list;
        }
        else{
            for(int i=0; i<=num.length-size; i++){
                int max = num[i];
                for(int a=i; a<size+i; a++){
                    max = num[a]>max? num[a]:max;
                }
                list.add(max);
            }
            return list;
        }
    }
}

