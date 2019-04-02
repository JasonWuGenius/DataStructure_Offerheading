package OfferHeading_Array;

public class offerheading_10 {
	/*
	 * ��Ŀ
	������һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת������һ����������������һ����ת�������ת�������СԪ�ء���������{3, 4, 5, 1, 2}Ϊ
		{1, 2, 3, 4, 5}��һ����ת�����������СֵΪ1��
		
	 */
	//����һ
	public static int minNumberInRotateArray1(int[] array){
		int low = 0;
		int high = array.length-1;
		while(low < high){
			int mid = low + (high - low)/2;
			if(array[mid] > array[high]){
				low = mid+1;
			}
			else if(array[mid] == array[high]){
				high = high-1;
			}
			else{
				high = mid;
			}
			System.out.println("Mid:"+mid+" low:"+low+" high:"+high);
		}
		return array[low];
	}
	//��������Ϊ�˽��һ���������⣬�����������𽥵ݽ�������
	public static int minNumberInRotateArray2(int[] array){
		if(array == null || array.length == 0)
			return 0;
		int low = 0;
		int high = array.length-1;
		int mid = (low+high)/2;
		if(array[low] < array[high])
			return array[low];
		//�м����ֺ���β������ͬ
		if(array[mid] == array[high] && array[mid] == array[low]){
			for(int i=1; i<=high; i++){
				if(array[i]<array[i-1])
					return array[i];
			}
			return array[low];
		}
		//�������
		while(low+1 != high){
			mid = (low+high)/2;
			if(array[mid] <= array[high]){
				high = mid;
			}
			if(array[mid] > array[high]){
				low = mid;
			}
			System.out.println("Mid:"+mid+" low:"+low+" high:"+high);
		}
		return array[high];
	}
	
	public static void main(String[] args) {
//		int[] array = {3,4,5,5,5,1,2,3};
		int[] array = {2,2,2,2,2,1,2};
//		int[] array = {1,2,3,4,5};
//		int[] array = {4,5,1,2,3};
//		int[] array = {0};
		System.out.print("The Array is:");
		for(int item: array){
			System.out.print(item+" ");
		}
		System.out.println();
		System.out.println("\nThe Minimum is:"+minNumberInRotateArray1(array));
	}

}
