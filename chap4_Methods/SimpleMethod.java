public class SimpleMethod{
	public static void main(String[] args){
		System.out.println("Hello from the main method.");
		displayMessage();
		System.out.println("back to main.");
	}
	
	public static void displayMessage(){
		System.out.println("hello from the displayMessage Method.");
	}
}