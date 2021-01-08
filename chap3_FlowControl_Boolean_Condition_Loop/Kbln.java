import java.io.*;
public class Kbln{
	public static void main(String[] args) throws IOException{
		char ch;
		System.out.print("Press a key followed by ENTER: ");
		ch = (char)System.in.read();
		System.out.println("Your key is: "+ch);
	}
}