package substraction;

import java.util.Scanner;

public class Substraction {
    public void substraction() {
        Scanner firstnumber = new Scanner(System.in);
        Scanner secondnumber = new Scanner(System.in);

        System.out.print("Write first number: ");
        double a = firstnumber.nextDouble();

        System.out.print("Write second number: ");
        double b = secondnumber.nextDouble();

        System.out.println("Your substraction result is " + (a - b));
    }
}
