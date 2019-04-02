package OfferHeading_String;

public class offerheading_04 {
	/*
	 * 替换空格
	 * 
	 * 题目
　　	请实现一个函数，把字符串中的每个空格替换成"%20"。例如输入“We are happy.”，则输出“We%20are%20happy.”。

	思路
	　　首先要询问面试官是新建一个字符串还是在原有的字符串上修改，本题要求在原有字符串上进行修改。
	　　若从前往后依次替换，在每次遇到空格字符时，都需要移动后面O(n)个字符，对于含有O(n)个空格字符的字符串而言，总的时间效率为O(n2)。
	　　转变思路：先计算出需要的总长度，然后从后往前进行复制和替换，，则每个字符只需要复制一次即可。时间效率为O(n)。
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
