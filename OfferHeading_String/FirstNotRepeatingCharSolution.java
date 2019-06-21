package OfferHeading_String;

import java.util.ArrayList;
import java.util.List;

/*
	第一个只出现一次的字符

	题目描述
	在一个字符串(0<=字符串长度<=10000，
	全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
	如果没有则返回 -1（需要区分大小写）.
*/
public class FirstNotRepeatingCharSolution {
	public static int FirstNotRepeatingChar(String str) {
		if(str == null || str.length() == 0){
			return -1;
		}
		List<Character> list = new ArrayList<>();
		for(int i=0; i<str.length(); i++){
			Character ch = str.charAt(i);
			if(!list.contains(ch)){
				list.add(ch);
			}
			else{
				list.remove(ch);
			}
		}
		return str.indexOf(list.get(0));
	}
	public static void main(String[] args) {
		String str = "jhgffghjiuytrewertyuiopk";
		System.out.println("String: "+str);
		System.out.println("The first not repeating char is : "+FirstNotRepeatingChar(str));
	}

}
