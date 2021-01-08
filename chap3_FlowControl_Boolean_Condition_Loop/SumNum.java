import java.util.Scanner;
public class SumNum{
	public static void main(String[] args){
		int Num, Sum=0;
		Scanner in = new Scanner(System.in);
		for(int i=1;i<=5;i++){
			System.out.print("Input NUmber "+i+" := ");
			Num = in.nextInt();
			Sum +=Num;
		}
		System.out.println("Sum = "+Sum);
	}
}