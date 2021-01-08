public class DeepAndDeeper{
	public static void main(String[] args){
		System.out.println("Hello from Main");
		deep();
		System.out.println("Back to Main.");
	}
	public static void deep(){
		System.out.println("Hello from deep.");
		deeper();
		System.out.println("Back to deep.");
	}
	public static void deeper(){
		System.out.println("Hello from deeper.");
	}
}