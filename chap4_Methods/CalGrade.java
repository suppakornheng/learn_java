public class CalGrade{
	public static char calculate(int score){
		char grade;
		if((score>=80)&&(score<=100))
			grade='A';
		else if((score>=70)&&(score<=80))
			grade='B';
		else if((score>=60)&&(score<=70))
			grade='C';
		else if((score>=50)&&(score<=60))
			grade='D';
		else
			grade='F';
		return grade;
	}
	public static void main(String[] args){
		System.out.println("Grade = "+calculate(75));
	}
}