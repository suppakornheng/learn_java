class calscore{
	public void calculate(){
		double score = Math.random()*100;
		if(score>=80){
			System.out.println("Grade is A");
		}else if(score>=70){
			System.out.println("Grade is B");
		}else{
			System.out.println("Grade is C");
		}
	}
}

public class calGrade{
	public static void main(String args[]){
		calscore obj = new calscore();
		obj.calculate();
	}
}