import java.util.Scanner;
public class Cal_Max{
	public static void main(String args[]){
		int num1, num2;
		Scanner stdin = new Scanner(System.in);
		System.out.print("Input Number 1 : ");
		num1 = stdin.nextInt();
		System.out.print("Input Number 2 : ");
		num2 = stdin.nextInt();
		int larger = TestMax.max(num1,num2);
		System.out.println("Max Data is "+larger);
	}
}

class TestMax{
	static int max(int num1,int num2){
		if(num1>num2)
			return num1;
		else
			return num2;
	}
}