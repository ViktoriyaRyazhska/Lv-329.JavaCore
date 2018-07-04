import java.util.Scanner;

public class CircleComputation {
        
    public static void main(String[] args) {
        CircleComputation aCircleComputation = new CircleComputation();
        aCircleComputation.runComputation();
    }
    
    private void runComputation()
    {
        var in = new Scanner(System.in);
    
        double radius;
        System.out.printf("Enter the radius: ");
        radius = in.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("\nThe area is %1$.4f", area);

        double perimeter = 2*Math.PI * radius;
        System.out.printf("\nThe perimeter is %1$.16f\n", perimeter);
    }
}
