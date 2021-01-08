import java.util.Scanner;
public class TestdoWhile2{
	public static void main(String[] args){
		int num;
		Scanner innum = new Scanner(System.in);
		do{
			System.out.print("Input Num: ");
			num=innum.nextInt();
		}while(num>100);
	}
}
