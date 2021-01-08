public class Example{
	public static void main(String[] args){
		Object a;
		Object b;
		a = new Point(3,4);
		b = new Point(3,4); //false
		//b = a;              //true
		System.out.println(a.equals(b));
	}
}