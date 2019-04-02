package OfferHeading_Iteration;

public class offerheading_09 {
	/*
	 *  쳲��������м�������̨������
	 *  
	 *  ��Ŀ������
		��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
		�������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
		n<=39
		
		˼·��
		f(n) = f(n-1) + f(n-2)����һ�ۿ����ǵݹ鰡����ֱ�����ĵݹ黷�����ݹ�϶���ˬ��
		�������Źؼ����������о͸㶨�ˣ�ע�������n�Ǵ�0��ʼ�ģ�
		if(n<=1) return n;
		else return Fibonacci(n-1)+Fibonacci(n-2);
		Ȼ����û��ʲô�ã�����������϶�׼����һ�������n����Stack Overflow��
		�ݹ鱾��������ջ��ջ���̫��ͻ������
		�ǵݹ�ķ��������ǽ�ָoffer˼·��ÿ��ʹ����������a,b��������һ������ֵsum,
		Ȼ��a,b,sum�ֱ���쳲����������е�����������ô����a=b,b=sum,����a��b�������ƶ���һ��λ�ã�
		�ټ���sum���ǵ�4�����ˣ��ظ�������̼��ɡ�
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
