public class CalFx{
	public static int fx(int x){
		int m;
		m=x*x+5;
		return m;
	}
	
	public static void main(String[] args){
		for(int i=0;i<=10;i++){
			System.out.println("Function of "+i+" = "+fx(i));
		}
	}
}