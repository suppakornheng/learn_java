public class TestSum2{
	public static void main(String[] args){
		int i,Sum=0;
		for(i=1;i<100;i++){
			if(((i%3)==0) || ((i%5)==0)){
				System.out.print(i+ " ");
				Sum+=i;
			}
		}
		System.out.println();
		System.out.println("Sum = "+Sum);
	}
}