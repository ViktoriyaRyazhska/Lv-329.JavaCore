public class Student {

	private static int sum;
	private static int count;

	private String name;
	private int rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		sum = sum - this.rating;
		this.rating = rating;
		sum = sum + rating;
	}

	public Student(String name, int rating) {
		this.name = name;
		this.rating = rating;
		sum = sum + rating;
		count++;
	}

	public Student(String name) {
		this.name = name;
		count++;
	}

	public Student() {
		count++;
	}

	public boolean betterStudent(Student s) {
		return this.rating > s.getRating();
	}

	@Override
	public String toString() {
		return "name = " + name + " raiting = " + rating;
	}

	public static double avgRating() {
		return sum / (double) count;
	}

}
