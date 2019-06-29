package OfferHeading_BackTrack;

/*
    字符串的排列

    题目描述
    输入一个字符串,按字典序打印出该字符串中字符的所有排列。
    例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串
    abc,acb,bac,bca,cab和cba。
    输入描述:
    输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */

import java.util.*;

public class PermutationSolution {
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> res= new ArrayList<>();
        if(str == null || str.length() == 0){
            return res;
        }
        char[] s = str.toCharArray();
        helper(res, 0, s);
        Collections.sort(res);
        return res;
    }

    public static void helper(ArrayList<String> res, int i, char[] s){
        if(i == s.length-1){
            if(!res.contains(new String(s))){
                res.add(new String(s));
            }
        }
        else{
            for(int j=i; j<s.length; j++){
                swap(s, i, j);
                helper(res, i+1, s);
                swap(s, i, j);
            }
        }
    }

    public static void swap(char[] t, int i, int j){
        if(i != j){
            char temp = t[i];
            t[i] = t[j];
            t[j] = temp;
        }
    }

    public static void main(String[] args) {
        String str = "abb";
        System.out.println("The String: "+str);
        System.out.println("The permutation list is : "+Permutation(str));
	}

}