import java.util.Scanner;
public class PersonSearch{
	public static void main(String[] args){
		String lookUp;
		String[] people={"Supot, Jaidee","Pracha, Meesuk","Pracha, Yindee","Somchai, Ruknam",
						 "Somjit, Kingkaew", "Thara, Thongkum", "Narong, Chandra", "Manop, Chumpae","Manop, Jitjai","Sunee, Nawong"};
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the first few characters of the name to look up: ");
		lookUp = keyboard.nextLine();
		System.out.println("Here are the names that match.");
		for(String person:people){
			if(person.startsWith(lookUp))
				System.out.println(person);
		}
	}
}