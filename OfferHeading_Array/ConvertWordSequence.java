package OfferHeading_Array;

/*
    ��ת����˳����

    ��Ŀ����
    ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��
    дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish����������
    ��ȴ������������˼�����磬��student. a am I������������ʶ����
    ��һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
    ��ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У�
    ���ܰ�����ô��
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