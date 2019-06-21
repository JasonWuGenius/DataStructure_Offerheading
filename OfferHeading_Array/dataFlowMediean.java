package OfferHeading_Array;

/*
	数据流中的中位数

	题目描述
	如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
	那么中位数就是所有数值排序之后位于中间的数值。
	如果从数据流中读出偶数个数值，那么中位数就是所有数值
	排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，
	使用GetMedian()方法获取当前读取数据的中位数。
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