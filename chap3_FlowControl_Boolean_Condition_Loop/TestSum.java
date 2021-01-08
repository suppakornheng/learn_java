import java.util.Scanner;
public class TestSum{
	public static void main(String[] arg){
		int Sum=0;
		int Num;
		Scanner in = new Scanner(System.in);
		System.out.println("Input Number: ");
		Num = in.nextInt();
		for(int i=1;i<=Num;i++)
			Sum+=i;
		System.out.println("Sum = "+Sum); 
	}
}