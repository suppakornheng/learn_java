public class SumArray{
	public static void main(String[] args){
		int sum=0;
		int sum1=0;
		int[] list = {1,2,3,4,5,6,7,8,9,10};
		for(int value:list)
			sum+=value;
		System.out.println("Sum = "+sum);
		
		for(int value:list){
			value=5;
			sum1+=value;
		}
		
		for(int index=0;index<list.length;index++){
			System.out.print(list[index]+" ");
		}
		System.out.println();
		System.out.println("Sum1 = "+sum1);
	}
}
