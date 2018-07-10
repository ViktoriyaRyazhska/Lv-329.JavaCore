package Ex2;

public class Dog {
	public static void main (String[] args) {
		Breed breed1 = Breed.Irma;
		Breed breed2 = Breed.Nayda;
		Breed breed3 = Breed.Rex;
		Dogs dog1 = new Dogs ("Vivcharka", 12, breed1);
		Dogs dog2 = new Dogs ("Rotveler", 9, breed2);
		Dogs dog3 = new Dogs ("Doberman", 15, breed3);
		
		System.out.println(dog1.equals(dog2));
		System.out.println(dog2.equals(dog3));
		System.out.println(dog1.equals(dog3));
		
		
		if ((dog1.getAge())>(dog2.getAge()) && (dog1.getAge())>(dog3.getAge())){
		System.out.println(dog1.getName() + " " +  dog2.getBreed() + " are the Oldest dog");
		}
		else if ((dog2.getAge())>(dog1.getAge()) && (dog2.getAge())>(dog3.getAge())){
			System.out.println(dog2.getName() + " " + dog2.getBreed() + " are the Oldest dog");
		}
		else if ((dog3.getAge())>(dog1.getAge()) && (dog3.getAge())>(dog2.getAge())){
			System.out.println(dog3.getName() + " " +  dog3.getBreed() + " are the Oldest dog");
		}
		
	}
}
