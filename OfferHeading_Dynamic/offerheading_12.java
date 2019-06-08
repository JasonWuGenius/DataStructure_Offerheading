package OfferHeading_Dynamic;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class offerheading_12 {
/*
	��Ŀ����
	������һ��m�к�n�еķ���һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���
	ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ��
	���ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ� 
	���磬��kΪ18ʱ���������ܹ����뷽��35,37����
	��Ϊ3+5+3+7 = 18�����ǣ������ܽ��뷽��35,38����
	��Ϊ3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�

*/
	
	public static int movingCount(int threshold, int rows, int cols)
    {
        boolean[] visited = new boolean[rows*cols];
        return movingCountCore(threshold, rows, cols, 0, 0, visited);
    }
    private static int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] visited){
        if(row<0 || row>=rows || col<0 || col>=cols){
            return 0;
        }
        int i=row*cols+col;
        if(visited[i] || !checkSum(threshold, row, col)){
            return 0;
        }
        visited[i] = true;
        return 1+movingCountCore(threshold, rows, cols, row, col+1, visited)
                +movingCountCore(threshold, rows, cols, row, col-1, visited)
                +movingCountCore(threshold, rows, cols, row-1, col, visited)
                +movingCountCore(threshold, rows, cols, row+1, col, visited);
    }
    private static boolean checkSum(int threshold, int row, int col){
        int sum=0;
        while(row!=0){
            sum+=row%10;
            row=row/10;
        }
        while(col!=0){
            sum+=col%10;
            col=col/10;
        }
        if(sum>threshold){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
		int threshold = 18;
		int rows = 9;
		int cols = 9;
		System.out.println(movingCount(threshold, rows, cols));
	}

}
