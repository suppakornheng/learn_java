import java.util.Scanner;
public class TestAverage{
	public static void main(String[] args){
		int score1,score2,score3;
		double average;
		char repeat;
		String input;
		System.out.println("This program calculates the " + "average of three test scores.");
		Scanner keyboard = new Scanner(System.in);
		do{
			System.out.print("Enter score1: ");
			score1=keyboard.nextInt();
			System.out.print("Enter score2: ");
			score2=keyboard.nextInt();
			System.out.print("Enter score3: ");
			score3=keyboard.nextInt();
			keyboard.nextLine();
			average = (score1+score2+score3)/3;
			System.out.println("the average is "+average);
			System.out.println();
			System.out.println("Would you like to average another set of test scores?");
			System.out.print("Enter Y for yes or N for no:");
			input = keyboard.nextLine();
			repeat = input.charAt(0);
		}while(repeat=='y'||repeat=='Y');
		
	}
}