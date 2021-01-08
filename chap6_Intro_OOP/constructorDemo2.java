public class constructorDemo2{
	public static void main(String[] args){
		Rectangle boxA = new Rectangle();
		Rectangle boxB = new Rectangle(3,2);
		System.out.println("The boxA's length is "+boxA.getLength());
		System.out.println("The boxA's width is "+boxA.getWidth());
		System.out.println("The boxA's area is "+boxA.getArea());
		System.out.println("The boxB's length is "+boxB.getLength());
		System.out.println("The boxB's width is "+boxB.getWidth());
		System.out.println("The boxB's area is "+boxB.getArea());
	}
}