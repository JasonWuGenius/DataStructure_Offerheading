package OfferHeading_String;

public class offerheading_42 {
	/*
	 * 反转单词顺序列
	 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
	 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
	 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
	 * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
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
