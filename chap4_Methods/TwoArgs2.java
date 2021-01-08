public class TwoArgs2{
	public static void main(String[] args){
		double a = 4.5;
		double b = 6.9;
		showSum(a,b);
	}
	
	public static void showSum(double num1, double num2){
		double sum=num1+num2;
		System.out.println("The sum is "+sum);
	}
}