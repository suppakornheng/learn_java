import java.util.Scanner;
import java.io.*;
public class FileWriterDemo{
	public static void main (String[] args) throws IOException{
		String filename;
		String friendName;
		int numFriends;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many friends do you have? ");
		numFriends = keyboard.nextInt();
		//System.out.println();
		keyboard.nextLine();
		System.out.println("Enter the File name: ");
		filename = keyboard.nextLine();
		FileWriter fw = new FileWriter(filename);
		PrintWriter pw = new PrintWriter(fw);
		for(int i=1;i<=numFriends;i++){
			System.out.print("Enter the name of friend number "+ i +": ");
			friendName = keyboard.nextLine();
			pw.println(friendName);;
		}
		pw.close();
		System.out.println("Data written to the file.");
	}
}