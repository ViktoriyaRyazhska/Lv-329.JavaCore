public class Tasks {
    public static int task1(int a) {

        int amount[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return amount[a - 1];
    }

    public static int task2(int a[]) {
        int sum = 0;
        int dob = 1;
        int result = 1;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (i <= 4 && a[i] >= 0) {
                sum = a[i] + sum;
                count++;
            } else if (i > 4) {
                dob = dob * a[i];
            }
        }
        if (count == 5) return result = sum;
        else return result = dob;
    }

    public static String task31(int[] b) {
        int positionOfSecondPositive = 0;
        int count = 0;
        int min = b[0];
        int positionOfMin = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > 0 && count < 2) {
                count++;
                positionOfSecondPositive = i;
            }
            if (b[i] < min) {
                min = b[i];
                positionOfMin = i;
            }
        }
        return "Positio of second positive number is : " + positionOfSecondPositive +
                "\nMinimum is " + min + " on position " + positionOfMin;
    }
}

