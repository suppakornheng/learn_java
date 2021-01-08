import java.util.Scanner;
public class testRate{
	public static void main(String[] args){
		final double RATE = 150;
		final int STANDARD = 40;
		double pay = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of hours worked: ");
		int hours = scan.nextInt();
		if(hours > STANDARD)
			pay = STANDARD*RATE+(hours-STANDARD)*(RATE*1.5);
		else
			pay = hours*RATE;
		System.out.println("Pay = "+pay);
	}
}