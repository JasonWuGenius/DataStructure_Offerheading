package OfferHeading_Dynamic;

import java.awt.print.Book;

/*
	矩阵中的路径

	题目描述
    请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
    路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，
    向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，
    则之后不能再次进入这个格子。 例如 a b c e s f c s a d e e 
    这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
    因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
*/
public class HasPathSolution {
    public static boolean HasPath(char[] matrix, int rows, int cols, char[] str){
        if(matrix == null || matrix.length == 0 || matrix.length != rows*cols || matrix.length < str.length){
            return false;
        }
        boolean[] visited = new boolean[rows*cols];
        int pathLength = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(hasPathCore(matrix, rows, cols, i, j, str, visited, pathLength)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean hasPathCore(char[] matrix, int rows, int cols, int row, int col, char[] str, boolean[] visited, int pathLength){
        boolean flag = false;
        if(row>=0 && row<rows & col>=0 && col<cols && !visited[row*cols+col] && str[pathLength] == matrix[row*cols+col]){
            pathLength++;
            if(pathLength == str.length){
                return true;
            }
            visited[row*cols+col] = true;

            flag = hasPathCore(matrix, rows, cols, row+1, col, str, visited, pathLength) || 
                            hasPathCore(matrix, rows, cols, row-1, col, str, visited, pathLength) || 
                            hasPathCore(matrix, rows, cols, row, col+1, str, visited, pathLength) || 
                            hasPathCore(matrix, rows, cols, row, col-1, str, visited, pathLength); 
            
            if(!flag){
                visited[row*cols+row] = false;
                pathLength--;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        char[] matrix = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        char[] str = {'b', 'c' ,'c' ,'e' ,'d'};
        for(char item: matrix){
            System.out.print(item+" ");
        }
        System.out.println();
        for(char item: str){
            System.out.print(item+" ");
        }
        System.out.println("\nThe matrix contains the str: "+HasPath(matrix, 3, 4, str));

    }
}



