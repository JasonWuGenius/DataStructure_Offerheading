package OfferHeading_Array;

/*
    ???????

    ????
    ???????????????????????????????
    ?????????4 X 4??? 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
    ????????1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */

import java.util.*;

public class PrintMatrixSolution {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return res;
        }
        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;
        while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            for(int j=top+1; j<=bottom; j++){
                res.add(matrix[j][right]);
            }
            if(top != bottom){
                for(int i=right-1; i>=0; i--){
                    res.add(matrix[bottom][i]);
                }
            }
            if(left != right){
                for(int j=bottom-1; j>top; j--){
                    res.add(matrix[j][left]);
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Matrix is : "+printMatrix(matrix));
	}

}