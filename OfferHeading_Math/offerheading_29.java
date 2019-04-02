package OfferHeading_Math;

public class offerheading_29 {
	/**
	 * 题目：我们把只包含因子2、3和5的数称作丑数（Ugly Number）。求按从小到大的顺序的第1500个丑数。
	 * 例如6、8都是丑数，但14不是，因为它包含因子7。习惯上我们把1当做第一个丑数。
	 * 
	 * 思路： 
	 * 使用一个数组将之前已经求出来的丑数保存起来，然后依次用2，3，5乘上数组中已经求出来的丑数，选出其中最小的一个保存到数组中。
	 * 假设数组中存的最大丑数是Max，那么只要求出2，3，5乘以数组中的某一个数刚好比Max大，然后选出三者间最小的就可以。
	 * 例如：当前数组中的丑数是：1，此时2*1，3*1，5*1，中最小的是2，将2存到数组中，此时数组中的数为1，2。
	 * Max=2，又因为2*1==Max，因此2乘的丑数应该为2*2，3*1>2,5*1>2,在新的4，3，5中最小的为3将3存到数组中，依次循环。
	 */
	//算法效率需要高一下，需要用空间去换时间，
	public static int getUglyNumber(int index){
		if(index == 0) return 0;
		int[] ugly = new int[index];
		ugly[0] = 1;
		int uglyIndex = 1, min;
		int nextIndex2 = 0, nextIndex3 = 0, nextIndex5 = 0;
		while(uglyIndex < index){
			//min用以保存生成的大于当前数组的最大值的最小丑数
			min = ugly[nextIndex2]*2<ugly[nextIndex3]*3? ugly[nextIndex2]*2:ugly[nextIndex3]*3;
			min = min<ugly[nextIndex5]*5? min:ugly[nextIndex5]*5;
			System.out.println("min:"+min);
			ugly[uglyIndex] = min;
			while(ugly[nextIndex2]*2<=min){
				//如果ugly[nextIndex2]小于当前数组的最大值，nextIndex2++
				nextIndex2++;
			}
			while(ugly[nextIndex3]*3<=min){
				//如果ugly[nextIndex3]小于当前数组的最大值，nextIndex3++
				nextIndex3++;
			}
			while(ugly[nextIndex5]*5<=min){
				//如果ugly[nextIndex5]小于当前数组的最大值，nextIndex5++
				nextIndex5++;
			}
			uglyIndex++;
		}
		return ugly[index-1];
	}
	
	public static void main(String[] args) {
		int index = 1500;
		System.out.println("The index "+index+" of ugly number list: "+getUglyNumber(index));
	}
}
