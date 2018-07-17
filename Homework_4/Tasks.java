import java.util.Scanner;

public class Tasks {
    private Scanner s = new Scanner(System.in);

    public void task1() {
        System.out.println("Enter 3 numbers(float) : ");
        float a[] = new float[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextFloat();
        }

        for (float anA : a) {
            if (anA > -5 && anA < 5) {
                System.out.println(anA + " belong to range -5 5.");
            } else System.out.println(anA + " do not belong to range -5 5.");
        }
        System.out.println("---------------------");
        System.out.println("Enter 3 numbers(integer) : ");
        int b[] = new int[3];
        for (int i = 0; i < b.length; i++) {
            b[i] = s.nextInt();
        }
        int max = b[0];
        int min = b[0];
        for (int anB : b) {
            if (anB >= max) {
                max = anB;
            } else if (anB <= min) {
                min = anB;
            }
        }
        System.out.println("Max is : " + max + "\nMin is : " + min);
        System.out.println("---------------------");

        System.out.println("Enter http error number or 0 to exit : ");
        int i = s.nextInt();
        if (i != 0) {
            HTTPerrors httpErrors = HTTPerrors.valueOf("H" + i);
            System.out.println(httpErrors.getS());
        } else System.exit(0);
    }

    public void task2() {
        Dog[] d = {
                new Dog("Rex", "GERMAN_SHEPHARD", 4),
                new Dog("Sharik", "GERMAN_SHEPHARD", 3),
                new Dog("Killer", "ROTTWEILER", 5)};


        if (d[0].equals(d[1]) || d[1].equals(d[2]) || d[0].equals(d[2]))
            System.out.println("We have 2 dogs whith same name");
        else System.out.println("There is no dogs whith same name");

        Dog dOld = d[0];
        for (Dog aD : d) {
            if (dOld.getAge() >= aD.getAge())
                dOld = aD;
        }
        System.out.println(dOld + " is the oldest dog.");
    }
}




