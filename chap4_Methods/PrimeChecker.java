import java.util.*;
public class PrimeChecker{
	public static boolean isPrime(int p){
		if(p<=1)
			return false;
		else if(p==2)
			return true;
		else if(p%2==0)
			return false;
		for(int i=3;i<p;i+=2)
			if(p%i==0)
				return false;
		return true;
	}
	
	public static void main(String[] args){
		int number;
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("Input Test PrimeNumber: ");
		number = input.nextInt();
		if(isPrime(number))
			System.out.println(number+" is a prime number.");
		else
			System.out.println(number+" is not prime.");
	}
}