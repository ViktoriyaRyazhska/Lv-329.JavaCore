import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter month number(1-12) : ");
//        System.out.println("This month have " + Tasks.task1(s.nextInt()) + " days");

//        System.out.println("Enter 10 integer numbers : ");
//        int arr []=new int [10];
//        for (int i=0;i<arr.length;i++) arr[i] = s.nextInt();
//        System.out.println(Tasks.task2(arr));
//
//        System.out.println("Tsak 3");
//        System.out.println("Enter 5 integer numbers : ");
//        int arr3[] = new int[5];
//        int dob=1;
//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = s.nextInt();
//            dob*=arr3[i];
//            if (arr3[i]<0) break;
//        }
//        System.out.println(Tasks.task31(arr3));
//        System.out.println("Produkt of all numbers is : " + dob);

        Car car[] = new Car[4];
        car[0] = new Car("Sedan", 2012, 1.6);
        car[1] = new Car("Station vagon", 2000, 2.0);
        car[2] = new Car("Minivan", 2006, 2.6);
        car[3] = new Car("Cabriolet", 2018, 3.0);

        System.out.println("Enter year : ");
        int year = s.nextInt();
        int count = 0;
        for (Car aCar : car) {
            if (aCar.getYearOfProduktion() == year) {
                System.out.println(aCar.toString());
                count++;
            }
        }
        if (count == 0) System.out.println("No car from this year");
        System.out.println("Sorting");
        Car tmp;
        for (int i = 0; i < car.length - 1; i++) {
            for (int j = i + 1; j < car.length; j++) {
                if (car[j].getYearOfProduktion() < car[i].getYearOfProduktion()) {
                    tmp = car[i];
                    car[i] = car[j];
                    car[j] = tmp;
                }
            }
        }
        for (Car aCar : car) {
            System.out.println(aCar.toString());
        }
    }
}
