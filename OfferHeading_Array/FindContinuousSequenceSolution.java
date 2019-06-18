package OfferHeading_Array;

/*
    ��ΪS��������������

    ��Ŀ����
    С����ϲ����ѧ,��һ����������ѧ��ҵʱ,
    Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
    ���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100
    (���ٰ���������)��û���,���͵õ���һ������������Ϊ100������:
    18,19,20,21,22�����ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS
    ��������������? Good Luck!
    �������:
    ������к�ΪS�������������С������ڰ��մ�С�����˳��
    ���м䰴�տ�ʼ���ִ�С�����˳��
 */

import java.util.ArrayList;
public class FindContinuousSequenceSolution {
    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        int high = 2, low = 1;
        while(high > low){
            int cur = (high+low)*(high-low+1)/2;
            if(cur == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for(int i=low; i<=high; i++){
                    list.add(i);
                }
                res.add(list);
                low++;
            }
            else if(cur < sum){
                high++;
            }
            else{
                low++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int sum = 100;
        System.out.println("The result list: "+FindContinuousSequence(sum));

	}

}