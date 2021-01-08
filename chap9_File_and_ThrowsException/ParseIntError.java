public class ParseIntError{
	public static void main(String[] args){
		String str = "abcde";	//Error
		//String str = "12345";	//Not Error
		int number;
		try{
			number = Integer.parseInt(str);
		}catch(NumberFormatException e){
			System.out.println("Conversion error: "+e.getMessage());
		}
	}
}