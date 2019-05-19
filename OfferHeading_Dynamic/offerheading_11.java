package OfferHeading_Dynamic;

/*
	�����е�·��

	��Ŀ����
	�����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����·�����ԴӾ����е�����һ�����ӿ�ʼ��ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ����һ��·�������˾����е�ĳһ�����ӣ���֮�����ٴν���������ӡ� ���� a b c e s f c s a d e e ������3 X 4 �����а���һ���ַ���"bcced"��·�������Ǿ����в�����"abcb"·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���ø��ӡ�
*/
public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        if(matrix.length == 0 || matrix == null || matrix.length != rows*cols || cols*rows < str.length){
            return false;
        }
        int pathLength = 0;
        boolean[] visited = new boolean[rows*cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(hasPathCore(matrix, rows, cols, i, j, str, visited, pathLength)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean hasPathCore(char[] matrix, int rows, int cols, int row, int col, char[] str, boolean[] visited, int pathLength){
        boolean flag = false;
        if(row>=0 && row<rows && col>=0 && col<cols && !visited[row*cols+col] && matrix[row*cols+col] == str[pathLength]){
            pathLength++;
            visited[row*cols+col] = true;
            if(pathLength == str.length){
                return true;
            }
            flag = hasPathCore(matrix, rows, cols, row, col+1, str,  visited, pathLength) ||
                hasPathCore(matrix, rows, cols, row, col-1, str,  visited, pathLength) ||
                hasPathCore(matrix, rows, cols, row+1, col, str,  visited, pathLength) ||
                hasPathCore(matrix, rows, cols, row-1, col, str,  visited, pathLength);
            if(!flag){
                pathLength--;
                visited[row*cols+col]=false;
            }
        }
        return flag;
    }
}



