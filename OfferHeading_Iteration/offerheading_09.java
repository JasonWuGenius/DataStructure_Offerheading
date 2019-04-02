package OfferHeading_Iteration;

public class offerheading_09 {
	/*
	 *  斐波那契数列及青蛙跳台阶问题
	 *  
	 *  题目详述：
		大家都知道斐波那契数列，现在要求输入一个整数n，
		请你输出斐波那契数列的第n项（从0开始，第0项为0）。
		n<=39
		
		思路：
		f(n) = f(n-1) + f(n-2)，第一眼看就是递归啊，简直完美的递归环境，递归肯定很爽，
		这样想着关键代码两三行就搞定了，注意这题的n是从0开始的：
		if(n<=1) return n;
		else return Fibonacci(n-1)+Fibonacci(n-2);
		然而并没有什么用，测试用例里肯定准备着一个超大的n来让Stack Overflow，
		递归本质是利用栈，栈深度太深就会溢出；
		非递归的方法，就是剑指offer思路，每次使用两个变量a,b来计算下一个数的值sum,
		然后a,b,sum分别是斐波那契数列中的三个数，那么就令a=b,b=sum,这样a和b就往下移动了一个位置，
		再计算sum就是滴4个数了，重复这个过程即可。
	 */
	public static long fibonacci(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		int a = 0;
		int b = 1;
		int i = 2;
		int sum = 0;
		while(i <= n){
			sum = a+b;
			a = b;
			b = sum;
			i++;
		}
		return sum;
	}
	public static void main(String[] args) {
		for(int i=1; i<10; i++){
			System.out.println("The index : "+i+"    The fibonacci : "+fibonacci(i));
		}
	}

}
