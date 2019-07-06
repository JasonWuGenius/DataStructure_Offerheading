package OfferHeading_Dynamic;

/*
    变态跳台阶
    
    题目描述
    一只青蛙一次可以跳上1级台阶，也可以跳上2级。
    求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。

    思路：
        f(n) = f(n-1)+f(n-2)
*/

import java.util.ArrayList;

public class JumpFloorSolution {
    public static int JumpFloor(int target) {
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }

    public static int JumpFLoor2(int target){
        if(target <= 2){
            return target;
        }
        int a = 1;
        int b = 2;
        while(target > 2){
            int temp = a+b;
            a = b;
            b = temp;
            target--;
        }
        return b;
    }
    public static void main(String[] args) {
        int target = 5;
        System.out.println("The target is: "+target);
        System.out.println("The solution of rectCover is: "+JumpFloor(target));
        System.out.println("The solution of rectCover is: "+JumpFLoor2(target));
    }
}

