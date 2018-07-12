import java.util.Scanner;

public class Homework4 {
    public static void output13(Integer variable) {
        HTTPError variable1;

        switch (variable) {
            case 400: {
                variable1 = HTTPError.BadRequest;
                break;
            }
            case 401: {
                variable1 = HTTPError.Unauthorized;
                break;
            }
            case 402: {
                variable1 = HTTPError.PaymentRequired;
                break;
            }
            case 403: {
                variable1 = HTTPError.Forbidden;
                break;
            }
            case 404: {
                variable1 = HTTPError.NotFound;
                break;
            }
            default: {
                variable1 = HTTPError.ItIsNotHTTPStatusCode;
            }
        }
        System.out.println(variable1.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task No.1
        System.out.println("Please input the values of the three variables:");
        Float variable111 = scanner.nextFloat();
        Float variable112 = scanner.nextFloat();
        Float variable113 = scanner.nextFloat();
        if (((variable111 >= (-5)) && (variable111 <= 5)) && ((variable112 >= (-5)) && (variable112 <= 5))  && ((variable113 >= (-5)) && (variable113 <= 5))) {
            System.out.println("Each of these values of the variables are in the range of [-5; 5].");
        }
        System.out.println("Please input the values of the three variables:");
        Integer variable121 = scanner.nextInt();
        Integer variable122 = scanner.nextInt();
        Integer variable123 = scanner.nextInt();
        if ((variable121 >= variable122) && (variable121 >= variable123)) {
            System.out.println("The variable with the maximum value equal: " + variable121 + ".");
        } else if ((variable122 >= variable121) && (variable122 >= variable123)) {
            System.out.println("The variable with the maximum value equal: " + variable122 + ".");
        } else {
            System.out.println("The variable with the maximum value equal: " + variable123 + ".");
        }
        System.out.println("Please input the number of the HTTP Error:");
        Integer variable13 = scanner.nextInt();
        output13(variable13);

        // Task No.2
        Dog variableArray[] = new Dog[3];
        variableArray[0] = new Dog("Dog #1", "No-breed", 1);
        variableArray[1] = new Dog("Dog #2", "No-breed", 2);
        variableArray[2] = new Dog("Dog #3", "No-breed", 3);
        if ((variableArray[0].getName().equals(variableArray[1].getName())) || (variableArray[0].getName().equals(variableArray[2].getName())) || (variableArray[1].getName().equals(variableArray[2].getName()))) {
            System.out.println("There are two dogs with the same name.");
        } else {
            System.out.println("There are no two dogs with the same name.");
        }
        if ((variableArray[0].getAge() >= variableArray[1].getAge()) && (variableArray[0].getAge() >= variableArray[2].getAge())) {
            System.out.println("\nThe oldest dog is:\nName: " + variableArray[0].getName() + ".\nBreed: " + variableArray[0].getBreed() + ".");
        } else if (variableArray[1].getAge() >= variableArray[2].getAge()) {
            System.out.println("\nThe oldest dog is:\nName: " + variableArray[1].getName() + ".\nBreed: " + variableArray[1].getBreed() + ".");
        } else {
            System.out.println("\nThe oldest dog is:\nName: " + variableArray[2].getName() + ".\nBreed: " + variableArray[2].getBreed() + ".");
        }
    }
}
