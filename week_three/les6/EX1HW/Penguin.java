package EX1HW;

public class Penguin extends NonFlyingBird {
	String string = "Penguin";

	void feathers() {
		String feathers = "Has a black and white feathers.";
		System.out.println(feathers);
		System.out.println("");
	}

	void layEggs() {
		String layEggs = "Lays eggs.";
		System.out.println(layEggs);
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "Penguin";
	}
}
