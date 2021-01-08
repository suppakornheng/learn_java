public class Help{
	public static void main(String[] args) throws java.io.IOException{
		char choice;
		do{
			System.out.println("Help on: ");
			System.out.println(" 1. if");
			System.out.println(" 2. switch");
			System.out.println(" 3. for");
			System.out.println(" 4. while");
			System.out.println(" 5. do-while\n");
			System.out.print("Choose one: ");
			do{
				choice = (char)System.in.read();
			}while(choice=='\n'|choice=='\r');
		}while(choice<'1'|choice>'5');
	}
}