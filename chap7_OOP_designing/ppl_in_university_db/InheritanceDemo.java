public class InheritanceDemo{
	public static void main(String[] args){
		Student s = new Student();
		s.setName("Teerawat Prakobphon");
		s.setStudentNumber(1234);
		s.writeOutput();
		System.out.println("Hi "+s.getName());
	}
}