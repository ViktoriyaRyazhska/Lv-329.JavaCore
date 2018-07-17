package EX1HW;

public class Chicken extends NonFlyingBird {
	String string = "Chicken";

	void feathers() {
		String feathers = "Has a red feathers. ";
		System.out.println(feathers);
		System.out.println("");
	}

	void layEggs() {
		String layEggs = "Lays eggs.";
		System.out.println(layEggs);
	}

	@Override
	public String toString() {
		return "Chicken";
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
