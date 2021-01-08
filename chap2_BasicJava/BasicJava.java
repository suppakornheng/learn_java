/**
 * @(#)BasicJava.java
 *
 *
 * @author 
 * @version 1.00 2020/11/29
 */


public class BasicJava {

	public static void main(String[] args){
		
		/*//escape sequence(??? \n \t \b \r)
		System.out.println("aaaaa\n"); // \n = new line   
		System.out.println("\taaaaa"); // \t = tab
		System.out.println("aaaaa\b"); // \b = backspace
		System.out.println("aaaaa\r"); // \r = return = enter = sometime is new line   
		System.out.println("aaaaa\\"); // \\ = backslash    
		System.out.println("aaaaa\'"); // \' = single quote   
		System.out.println("aaaaa\""); // \" = double quote
		*/
		
		/*	
		//Variable Declaration
		int x;
		x=8;
		int y=8;
		
		char x,y;
		x='A';
		y='\u0041'; // unicode 0041 = 'A'
		
		final double PI = 3.141; //final = constant declaration, final variable's value cannot be change
		
		System.out.println("x="+x+" y="+y);//print of variable
		
		/*Size
		1.Boolean 1 bit, true or false
		2.char	2 byte	= 16 bit, unicode character
		3.byte	1 byte	=  8 bit, -128 to +127
		4.short	2 byte, -2^15 to 2^15-1
		5.int		4 byte,	-2*31 to 2^31-1
		6.long	8 byte,	-2*63 to 2^63-1
		7.float	4 byte,	+-3.40*10^-38 to +-3.40*10^38
		8.double	8 byte	+-1.7*10^-308 to +-1.7*10^+308
		*/
		
		/* x++ ++x
		y = ++x ; y=x+1, then x=x+1
		y = x++ ; y=x, then x=x+1
		*/
	
		/*
		//Cast Operators
		double x,y;
		x = (double)5/4; // x = 5.0/4 = 1.25
		y = (double)(5/4); // y = double(1) = 1.0
		
		int number;
		number = (int)72.567; // number = 72
		
		int pies=10, ppl=4;
		double piePerPerson;
		piePerPerson = pies/ppl; // piePerPerson = 2
		piePerPerson = (double)pies/ppl; // piePerPerson = 2.5
		piePerPerson = pies/(double)ppl; // piePerPerson = 2.5
		System.out.println(piePerPerson);
		*/
		
		//String Class
		
		/*Method			Output
		  charAt(index)		a character at the index
		  length()			length of string
		  toLowerCase()		change all char in string to lower case
		  toUpperCase()		change all char in string to upper case
		  
		*/
		
		
    }
}