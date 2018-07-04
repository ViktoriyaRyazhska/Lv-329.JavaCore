public class Appl {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Anna");
		s1.setRating(5);
		
		Student s2 = new Student("Ivan");
		s2.setRating(3);

		Student s3 = new Student("Olga", 3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s2.betterStudent(s1));
		
		System.out.println(Student.avgRating());
	}

}
