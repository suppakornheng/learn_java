import java.util.Scanner;
public class TestGrade{
	public static void main(String[] args){
		int testScore;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your numberic test score and I will tell you the grade: ");
		testScore = sc.nextInt();
		if(testScore<60)
			System.out.print("Your grade is F.");
		else if(testScore<70)
			System.out.print("Your grade is D.");
		else if(testScore<80)
			System.out.print("Your grade is C.");
		else if(testScore<90)
			System.out.print("Your grade is B.");
		else if(testScore<=100)
			System.out.print("Your grade is A.");
		else
			System.out.println("Invalid score.");
	}
}