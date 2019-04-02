package OfferHeading_Array;

public class offerheading_01 {
	/*
	 * �ҳ��������ظ�������
	 * 
	 * ��Ŀ
	������һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ�������ĳЩ�������ظ��ģ�
		����֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Ρ����ҳ�����������һ���ظ������֡�
		���磬������볤��Ϊ7������{2, 3, 1, 0, 2, 5, 3}����ô��Ӧ��������ظ�������2����3��
		
		˼·
	�����ӹ�ϣ���˼·��չ���������飺��ɨ���ÿ�����֣�������m���ŵ����Ӧ�±꣨m�±꣩��λ���ϣ�
		��ͬһλ�����ظ�����˵���������ظ������ڶ���д����ǰӦ������ò���������
	 */
	public static int getDuplicate(int[] arr){
		if(arr == null || arr.length <= 0){
			System.out.println("The array is not available");
			return -1;
		}
		for(int a:arr){
			if(a<0 || a>arr.length-1){
				System.out.println("The num is out of bound!");
				return -1;
			}
		}
		for(int i=0; i<arr.length; i++){
			int temp;
			while(arr[i] != i){
				if(arr[arr[i]] == arr[i])
					return arr[i];
				temp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp;
			}
		}
		System.out.println("There is no Duplicate Nums!");
		return -1;
	}
	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 2, 4 };
		int[] arr = {2, 3, 1, 0, 2, 5, 3};
		System.out.println("The Duplicate Number:"+getDuplicate(arr));
	}
}
