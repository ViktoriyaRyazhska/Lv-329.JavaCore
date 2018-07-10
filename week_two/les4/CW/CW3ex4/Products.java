package CW4;
public class Products {
public static void main(String[] args) {
		
		Product product1 = new Product ("Milk Molokia", 20.50, 100);
		Product product2 = new Product ("Chicken meat", 70.45, 50);
		Product product3 = new Product ("Black bread", 10.00, 120);
		Product product4 = new Product ("Cherry", 50.00, 20);
		
		if (product1.getPrice()>product2.getPrice() && product1.getPrice()>product3.getPrice() && product1.getPrice()>product4.getPrice() ) {
System.out.println("Milk have has the highest price");
	}
		else if (product2.getPrice()>product1.getPrice() && product2.getPrice()>product3.getPrice() && product2.getPrice()>product4.getPrice() ) {
			System.out.println("Chicken meat has the highest price");
				}
		else if (product3.getPrice()>product1.getPrice() && product3.getPrice()>product2.getPrice() && product3.getPrice()>product4.getPrice() ) {
			System.out.println("Black bread has the highest price");
				}
		else if (product4.getPrice()>product1.getPrice() && product4.getPrice()>product2.getPrice() && product4.getPrice()>product3.getPrice() ) {
			System.out.println("Black bread has the highest price");
				}

		if (product1.getNumber()>product2.getNumber() && product1.getNumber()>product3.getNumber() && product1.getNumber()>product4.getNumber() ) {
            System.out.println("Milk Molokia has the largest number");
		}
        else if (product2.getNumber()>product1.getNumber() && product2.getNumber()>product3.getNumber() && product2.getNumber()>product4.getNumber() ) {
            System.out.println("Chicken meat has the largest number");
        }
        else if (product3.getNumber()>product1.getNumber() && product3.getNumber()>product2.getNumber() && product3.getNumber()>product4.getNumber() ) {
            System.out.println("Black bread has the largest number");
        }
        else if (product4.getNumber()>product1.getNumber() && product4.getNumber()>product2.getNumber() && product4.getNumber()>product3.getNumber() ) {
            System.out.println("Cherry has the largest number");
	}
		
	}
}
