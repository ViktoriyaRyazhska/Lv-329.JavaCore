package CW4ex1;
class Numbers {
	float number;
	
	public float getNumber() {
		return number;
	}
	public void setNumber(float number) {
		this.number = number;
	}
	public Numbers(float number) {
	this.number = number;
	}
	public void range() {
		if(this.number <= 5 && this.number >=-5){
			System.out.println("This number are in range [-5;5]");
		}
			else {
				System.out.println("This number are not in range [-5;5]");
				}
	}
}


