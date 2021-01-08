import java.util.*;
public class Dice{
	private int numDice;
	private Random random;
	static private int numDiceObjects =0;
	
	public Dice(){
		numDice=1;
		random = new Random();
		numDiceObjects++;
	}
	public Dice(int n){
		numDice=n;
		random = new Random();
		numDiceObjects++;
	}
	public int rollDice(){
		int sum=0;
		for(int i=1;i<=numDice;i++){
			sum+=random.nextInt(6)+1; // random.nextInt(n) -> random between 0 to n-1
		}
		return sum;
	}
	public int getNumDice(){
		return numDice;
	}
	public void setNumDice(int n){
		numDice=n;
	}
	public int getNumDiceObjects(){
		return numDiceObjects;
	}
}