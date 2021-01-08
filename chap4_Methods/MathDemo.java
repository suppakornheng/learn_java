public class MathDemo{
	public static void main(String[] args){
		System.out.println(Math.pow(4,2));
		System.out.println(3*Math.pow(6.0,3.0));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*6+1));
		System.out.println(Math.sqrt(5));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.pow(2,2));
		System.out.println(Math.log(Math.E));
		System.out.println(Math.exp(1));
		System.out.println(Math.max(2,Math.min(3,4)));
		System.out.println(Math.ceil(-2.5));
		System.out.println(Math.floor(-2.5));
		System.out.println(Math.round(-2.5F));
		System.out.println(Math.rint(2.5));
		System.out.println(Math.round(Math.abs(-2.5)));
		byte x=22;
		byte y=0x22;
		System.out.println(x);
		System.out.println(y);
		System.out.println("-----------------");			
		System.out.println(Math.PI);				
		System.out.println(Math.toRadians(180));
		System.out.println(Math.toRadians(Math.PI));	
		System.out.println(Math.sin(Math.PI));
		System.out.println(Math.cos(Math.PI));
		System.out.println("-----------------");
	}
}