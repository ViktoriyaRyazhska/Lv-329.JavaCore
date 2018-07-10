package CW4ex4;
import java.util.Scanner;
class Integer{
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three integer for MinMax function: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
		if (a < b && a < c) {
			System.out.println("Min:" + a);
		}
		else if (b < a && b < c) {
			System.out.println("Min:" + b);
		}
		else if (c < a && c < b) {
			System.out.println("Min:" + c);
		}
		else if (a==b || b==c || c==a){
			System.out.println("Two other integer are the Min");
		}
	
    
    	if (a > b && a > c) {
			System.out.println("Max:" + a);
		}
		else if (b > a && b > c) {
			System.out.println("Max:" + b);
		}
		else if (c > a && c > b) {
			System.out.println("Max:" + c);
		}
		else if (a==b || b==c || c==a){
			System.out.println("Two other integer are the Max");
			}
    }
    }

    
