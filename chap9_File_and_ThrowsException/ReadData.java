import java.io.*;
public class ReadData{
	/*
	//throws IOException
	public static void main(String[] args)  throws IOException{
		//if no throws IOException -> get error: unreported exception IOException; must be caught or declared to be thrown: System.in.read(data);
		byte[] data = new byte[10];
		System.out.print("input character: ");
		System.in.read(data);
		System.out.print("Your input is: ");
		for(int i=0;i<data.length;i++){
			System.out.print((char)data[i]);
		}
	}
	
	*/
	//try-catch
	public static void main(String[] args){
		byte[] data = new byte[10];
		System.out.print("input character: ");
		try{
			System.in.read(data);
			System.out.print("Your input is: ");
			for(int i=0;i<data.length;i++){
				System.out.print((char)data[i]);
			}
		}catch(Exception e){
			System.out.println("Illegal Input");
		}
	}
}