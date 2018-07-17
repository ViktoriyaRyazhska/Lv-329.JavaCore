package EX1HW;

public class Swallow extends FlyingBird {
	String string = "Swallow";

	void feathers() {
		String feathers = "Has a black and white feathers";
		System.out.println(feathers);
		System.out.println("");
	}

	void layEggs() {
		String layEggs = "Lays eggs.";
		System.out.println(layEggs);
	}

	@Override
	public String toString() {
		return "Swallow";
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}