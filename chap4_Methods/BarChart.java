import java.util.Scanner;
public class BarChart{
	public static void Bar(int data){
		for(int x=1;x<=data;x++){
			System.out.print("*");
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x;
		System.out.print("Input Data: ");
		x = in.nextInt();
		Bar(x);
	}
}