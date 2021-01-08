import java.io.*;
public class BasicRead{

	public static void main(String[] args) throws IOException{
		/*
		//program 9.6
		FileReader fr = new FileReader("test.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		str = br.readLine();
		while(str != null){
			System.out.println(str);
			str = br.readLine();//br.readLine() return String
		}
		br.close();
		
		System.out.println();
		
		//program 9.7
		double sum;
		String str2;
		FileReader fr2 = new FileReader("test.txt");
		BufferedReader br2 = new BufferedReader(fr2);
		
		sum=0.0;	
		str2 = br2.readLine();
		while(str2 != null){
			sum += Double.parseDouble(str2);
			str2 = br2.readLine();
		}
		br2.close();
		System.out.println("The sum of the numbers in test.txt is "+sum);	
			
		System.out.println();
		*/
		//program 9.8
		int rawData;
		char ch;
		try{
			FileReader fr3 = new FileReader("test.txt");
			rawData = fr3.read();
			while(rawData != -1){
				ch = (char)rawData; // (char) is needed because fr.read() return int
				System.out.print(ch);
				rawData = fr3.read(); // fr.read() return int -> ASCII code
			}
		}catch(IOException e){
			System.out.println("Error: "+e.getMessage());
		}
	}
}