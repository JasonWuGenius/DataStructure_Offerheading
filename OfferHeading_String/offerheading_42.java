package OfferHeading_String;

public class offerheading_42 {
	/*
	 * ��ת����˳����
	 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
	 * ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
	 * ���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
	 * ��ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
	 */
	public static String reverseSentence(String str){
		if(str == null || str == "")
			return str;
		char[] strArray = str.toCharArray();
		reverse(strArray, 0, strArray.length-1);
		int begin = 0;
		for(int i=0; i<strArray.length; i++){
			if(strArray[i] == ' '){
				reverse(strArray, begin, i-1);
				begin = i+1;
			}
			if(i == strArray.length-1){
				reverse(strArray, begin, strArray.length-1);
			}
		}
		return String.valueOf(strArray);
	}
	public static void reverse(char[] str, int begin, int end){
		while(begin<end){
			char temp = str[begin];
			str[begin] = str[end];
			str[end] = temp;
			begin++;
			end--;
		}
	}
	public static void main(String[] args) {
		String str = "I am a student.";
		System.out.println("The revered Srting :\n"+reverseSentence(str));
	}

}
