package OfferHeading_Array;

/*
    ��С��K����

    ��Ŀ����
    ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�
    ����С��4��������1,2,3,4,��

    ˼·��
    ������Ҫ������˼����ҳ�����K������
 */


import java.util.*;

public class GetLeastNumbersSolution {
    public static ArrayList<Integer> GetLeastNumbers(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k >= input.length){
            return list;
        }
        for(int i=0; i<k; i++){
            for(int j=0; j<input.length-1-i; j++){
                if(input[j] < input[j+1]){
                    int temp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = temp;
                }
            }
            list.add(input[input.length-1-i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] input = {4,5,1,6,2,7,3,8};
        int k = 4;
        System.out.println("The List:");
        for(int item: input){
            System.out.print(item+" ");
        }
        System.out.printf("\nThe Least Num of %d is %s", k, GetLeastNumbers(input, k));
	}

}