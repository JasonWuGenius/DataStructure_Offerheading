package OfferHeading_String;

public class offerheading_42_2 {
	/*
	 * ����ת�ַ���
	 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
	 * �������ַ���ģ�����ָ���������������һ���������ַ�����S��
	 * �������ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,
	 * Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK��
	 * �㶨����
	 * 
	 * ˼·
		���ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ����
		����XYZdefabc���� ��ָoffer˼·���ȷ�ת�����ַ���������fedZYXcba,
		Ȼ��תǰ6λXYZdef�ٷ�ת����λabc����ô����XYZdefabc��
	 */
	public static String LeftRotateString(String str, int n){
		if(str == null || str == ""){
			return str;
		}
		n = n % str.length();
		char[] strArray = str.toCharArray();
		reverse(strArray, 0, strArray.length-1);
		reverse(strArray, 0, strArray.length-n-1);
		reverse(strArray, strArray.length-n, strArray.length-1);
		return String.valueOf(strArray);
	}
	public static void reverse(char[] str, int begin, int end){
		while(begin < end){
			char temp = str[begin];
			str[begin] = str[end];
			str[end] = temp;
			begin++;
			end--;
		}
	}
	public static void main(String[] args) {
		String str = "abcXYZdef";
		int n = 3;
		System.out.println("Before: "+str);
		System.out.println("After: "+LeftRotateString(str, n));
	}

}
