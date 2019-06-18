package OfferHeading_Array;

/*
    翻转单词顺序列

    题目描述
    牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，
    写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，
    但却读不懂它的意思。例如，“student. a am I”。后来才意识到，
    这家伙原来把句子单词的顺序翻转了，
    正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，
    你能帮助他么？
 */

import java.util.*;

public class ConvertWordSequence {
    public static String ReverseSentence(String str){
        if(str == null || str.length() == 0 || str.trim().length() == 0){
            return null;
        }
        String[] newstr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=newstr.length-1; i>=0; i--){
            if(i == 0){
                sb.append(newstr[i]);
            }
            else{
                sb.append(newstr[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "I am a student.";
        System.out.println("String: "+str);
        String newstr = ReverseSentence(str);
        System.out.println("New String: "+newstr);
	}

}