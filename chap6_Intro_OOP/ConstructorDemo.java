public class ConstructorDemo{
	public static void main(String[] args){
		Rectangle box = new Rectangle(8,12.0);
		
		System.out.println("The box's length is "+box.getLength());
		System.out.println("The box's width is "+box.getWidth());
		System.out.println("The box's area is "+box.getArea());
	}
}