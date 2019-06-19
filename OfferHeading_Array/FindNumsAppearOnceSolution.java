package OfferHeading_Array;

/*
    ������ֻ����һ�ε�����

    ��Ŀ����
    һ�����������������������֮�⣬
    ���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�

    ˼·
    ������ס��������ͬ������������0.

    �������������ֻ��һ������ֻ����һ�Σ����Ǵ�ͷ��β���ÿ�����֣�
    ��ô���յĽ���պ����Ǹ�ֻ����һ�ε����֡�

    ����������������������������ֻ����һ�Σ�����ܹ��������Ϊ�����֣�
    �������ж�ֻ��һ������ֻ����һ�Σ���ô�Ϳ��Խ���������ˡ�

    ������ⷽ����

    �����������ɴ�ͷ��β���ÿ�����֣���ô���յĽ������������ֻ����һ�ε����ֵ��������
    ������������ͬ�����������������һ����һλΪ1���ѽ���е�һ��1��λ�ü�Ϊ��nλ��
    ��Ϊ������ֻ����һ�ε����ֵ�����������������������ڵ�nλ�ϵ�����һ����1��0��

    ���� ���������Ǹ���������ÿ�����ֵĵ�nλ�ϵ������Ƿ�Ϊ1�����з��飬
    ǡ���ܽ������Ϊ������ֻ��һ������ֻ����һ�ε����飬�����������ͷ��β���
    �Ϳ��Եõ����������ˡ�
 */

import java.util.*;

public class FindNumsAppearOnceSolution {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length < 2){
            return;
        }
        int xorresult = 0;
        int flag = 1;
        for(int i=0; i<array.length; i++){
            xorresult ^= array[i];
        }
        int highestOneBit = Integer.toBinaryString(xorresult).length()-1;
        num1[0] = xorresult;
        num2[0] = xorresult;
        for(int i=0; i<array.length; i++){
            if((array[i] >> highestOneBit & 1) == 0){
                num2[0] ^= array[i];
            }
            else{
                num1[0] ^= array[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,3,2,1,7,15};
        int[] num1 = {1};
        int[] num2 = {1};
        FindNumsAppearOnce(array, num1, num2);
        System.out.println("num1: "+num1[0]+"  num2: "+num2[0]);
	}

}