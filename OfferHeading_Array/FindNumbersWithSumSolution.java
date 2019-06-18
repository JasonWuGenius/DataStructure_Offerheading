package OfferHeading_Array;

/*
    ��ΪS����������

    ��Ŀ����
    ����һ����������������һ������S���������в�����������
    ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
    �������:
    ��Ӧÿ�����԰����������������С���������
 */

import java.util.ArrayList;
public class FindNumbersWithSumSolution {
    //��Ϊ�Ѿ��ź�˳���ˣ����Դ�����һֱ���ϱƽ����ĵ㣬�Ϳ��Եõ��ɼ��������������
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if(array.length < 2 || array == null){
            return list;
        }
        int i=0, j=array.length-1;
        while(i<j){
            if(array[i]+array[j] == sum){
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }
            else if(array[i]+array[j]>sum){
                j--;
            }
            else{
                i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,12,20};
        int sum = 5;
        System.out.println("The result list: "+FindNumbersWithSum(array, sum));

	}

}