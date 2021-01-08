public class SameArray{
	public static void main(String[] args){
		int[] array1 = {2,4,6,8,10};
		int[] array2 = array1;
		array1[0] = 200;
		array2[4] = 1000;
		System.out.println("The contents of array1:");
		for(int index=0;index<array1.length;index++){
			System.out.print(array1[index]+" ");
		}
		System.out.println();
		System.out.println("The contents of array2:");
		for(int index=0;index<array2.length;index++){
			System.out.print(array2[index]+" ");
		}
		System.out.println();
	}
}