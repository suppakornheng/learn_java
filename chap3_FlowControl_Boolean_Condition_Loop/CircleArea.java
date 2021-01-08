import java.util.Scanner;
public class CircleArea{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter teh radius: ");
		double radius = reader.nextDouble();
		if(radius<0)
			System.out.println("Error: Radius must be >=0");
		else{
			double area = 3.141*radius*radius;
			System.out.println("The are is "+area);
		}
		
	}
}