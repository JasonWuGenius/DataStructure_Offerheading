package OfferHeading_Array;

/*
 * �����������ֵ
 * 
 * ��Ŀ����
����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ�����磬
�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ�
���ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� �������{2,3,4,2,6,2,5,1}�Ļ�������������6����
 {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}�� 
 {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
 */

import java.util.ArrayList;

public class slideWindowMaximum {
    public ArrayList<Integer> maxInWindows(int [] nums, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(nums==null || nums.length<size || size==0){
            return res;
        }
        else{
            for(int i=0; i<=nums.length-size; i++){
                int max = nums[i];
                for(int j=i+1; j<i+size; j++){
                    if(nums[j]>max){
                        max = nums[j];
                    }
                }
                res.add(max);
            }
        }
        return res;
    }
}