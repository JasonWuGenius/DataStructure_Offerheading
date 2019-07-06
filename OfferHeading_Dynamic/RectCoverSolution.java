package OfferHeading_Dynamic;

/*
    矩形覆盖
    
    题目描述
    我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
    请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
*/

import java.util.ArrayList;

public class RectCoverSolution {
    public static int RectCover(int target) {
        if(target <= 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        return RectCover(target-1) + RectCover(target-2);
    }
    public static void main(String[] args) {
        int target = 4;
        System.out.println("The target is: "+target);
        System.out.println("The solution of rectCover is: "+RectCover(target));
    }
}

