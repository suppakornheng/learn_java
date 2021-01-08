import java.io.*;
public class SimpleFileWriter{
	public static void main(String[] args) throws IOException{
		//program 9.9
		String output = "To thine own self be true.";
		int rawData;
		try{
			FileWriter fw = new FileWriter("NewFile.txt");
			for(int i=0;i<output.length();i++){
				rawData = (int) output.charAt(i);
				fw.write(rawData);
			}
			fw.close();
		}catch(IOException e){
			System.out.println("Error: "+e.getMessage());
		}
		
		//program 9.10
		String letter = "This is test data";
		FileWriter fw1 = new FileWriter("WriteData.txt");
		fw1.write(letter,0,17);
		fw1.write("\nTest Write Data to File A-Z \n");
		for(int i =65;i<91;i++){
			fw1.write((char)i);
		}
		fw1.close();
		System.exit(0);
		
	}
}