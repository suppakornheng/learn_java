import java.text.DecimalFormat;
public class Format1{
	public static void main(String[] args){
		double num1 = 0.16666666667;
		double num2 = 1.66666666667;
		double num3 = 16.66666666667;
		double num4 = 166.66666666667;
		
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		System.out.println(formatter.format(num1));
		System.out.println(formatter.format(num2));
		System.out.println(formatter.format(num3));
		System.out.println(formatter.format(num4));
	}
}