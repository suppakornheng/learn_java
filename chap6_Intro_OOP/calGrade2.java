import java.util.Scanner;
class calscore{
	public void calculate(double score){
		if(score>=80){
			System.out.println("Grade is A");
		}else if(score>=70){
			System.out.println("Grade is B");
		}else if(score>=60){
			System.out.println("Grade is C");
		}else if(score>=50){
			System.out.println("Grade is D");
		}else{
			System.out.println("Grade is F");
		}
	}
}

public class calGrade2{
	public static void main(String args[]){
		calscore obj = new calscore();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input num: ");	
		obj.calculate(keyboard.nextInt());
	}
}