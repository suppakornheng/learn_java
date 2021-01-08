public class LoopCall{
	public static void main(String[] args){
		System.out.println("Hello from main.");
		for(int i=0;i<5;i++)
			displayMessage();
		System.out.println("Back to main.");
	}
	public static void displayMessage(){
		System.out.println("Hello from displayMessage Method.");
	}
}