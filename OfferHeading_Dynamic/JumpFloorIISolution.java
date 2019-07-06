package OfferHeading_Dynamic;

/*
    变态跳台阶
    
    题目描述
    一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
    求该青蛙跳上一个n级的台阶总共有多少种跳法。

    思路：
                | 1       ,(n=0 ) 
        f(n) =  | 1       ,(n=1 )
                | 2*f(n-1),(n>=2)
*/

import java.util.ArrayList;

public class JumpFloorIISolution {
    public static int JumpFloorII(int target) {
        if(target == 0){
            return 1;
        }
        int[] a = new int[target+3];
        a[0] = 1;
        a[1] = 1;
        a[2] = 2;
        if(target >= 0 && target < 3){
            return a[target];
        }
        for(int i=3; i<=target; i++){
            a[i] = 2*a[i-1];
        }
        return a[target];
    }
    public static void main(String[] args) {
        int target = 4;
        System.out.println("The target is: "+target);
        System.out.println("The solution of rectCover is: "+JumpFloorII(target));
    }
}

