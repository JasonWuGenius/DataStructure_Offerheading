package OfferHeading_Array;

/*
	�������е���λ��

	��Ŀ����
	��εõ�һ���������е���λ����������������ж�����������ֵ��
	��ô��λ������������ֵ����֮��λ���м����ֵ��
	������������ж���ż������ֵ����ô��λ������������ֵ
	����֮���м���������ƽ��ֵ������ʹ��Insert()������ȡ��������
	ʹ��GetMedian()������ȡ��ǰ��ȡ���ݵ���λ����
 */

import java.util.*;

public class DataFlowMediean {
    LinkedList<Integer> list = new LinkedList<>();
    public void Insert(Integer num) {
        if(list.size() == 0 || list == null){
            list.addFirst(num);
        }
        else{
            boolean insertFlag = false;
            for(int e: list){
                if(num<e){
                    int index = list.indexOf(e);
                    list.add(index, num);
                    insertFlag = true;
                    break;
                }
            }
            if(!insertFlag){
                list.addLast(num);
            }
        }
    }

    public Double GetMedian() {
        if(list.size() == 0){
            return null;
        }
        int i = list.size()/2;
        if(list.size()%2 == 0){
            return Double.valueOf((list.get(i)+list.get(i-1)))/2;
        }
        return Double.valueOf(list.get(i));
    }
    public static void main(String[] args) {
		dataFlowMediean df = new dataFlowMediean();
		df.Insert(2);
//		df.Insert(5);
//		df.Insert(4);
		df.Insert(3);
		System.out.println(df.list);
		System.out.println(df.GetMedian());
	}

}