package OfferHeading_String;

public class offerheading_04 {
	/*
	 * �滻�ո�
	 * 
	 * ��Ŀ
����	��ʵ��һ�����������ַ����е�ÿ���ո��滻��"%20"���������롰We are happy.�����������We%20are%20happy.����

	˼·
	��������Ҫѯ�����Թ����½�һ���ַ���������ԭ�е��ַ������޸ģ�����Ҫ����ԭ���ַ����Ͻ����޸ġ�
	��������ǰ���������滻����ÿ�������ո��ַ�ʱ������Ҫ�ƶ�����O(n)���ַ������ں���O(n)���ո��ַ����ַ������ԣ��ܵ�ʱ��Ч��ΪO(n2)��
	����ת��˼·���ȼ������Ҫ���ܳ��ȣ�Ȼ��Ӻ���ǰ���и��ƺ��滻������ÿ���ַ�ֻ��Ҫ����һ�μ��ɡ�ʱ��Ч��ΪO(n)��
	 */
	public static String replaceSpace(StringBuffer str){
		if(str == null || str.length() == 0){
			return null;
		}
		int length = str.length();
		int indexOfOriginal = length-1;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' ')
				length += 2;
		}
		str.setLength(length);
		int indexOfNew = length-1;
		while(indexOfOriginal < indexOfNew){
			if(str.charAt(indexOfOriginal) != ' '){
				str.setCharAt(indexOfNew--, str.charAt(indexOfOriginal));
			}
			else{
				str.setCharAt(indexOfNew--, '0');
				str.setCharAt(indexOfNew--, '2');
				str.setCharAt(indexOfNew--, '%');
			}
			indexOfOriginal--;
		}
		return str.toString();
	}
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("We are happy.");
//		StringBuffer str = new StringBuffer("Wearehappy.");
//		StringBuffer str = new StringBuffer("");
		System.out.println("The Origianl : "+str);
		System.out.println("The New : "+replaceSpace(str));
	}

}
