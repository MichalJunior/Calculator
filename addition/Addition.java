package addition;

import java.util.Scanner;

public class Addition {

    public void addition() {
        Scanner firstnumber = new Scanner(System.in);
        Scanner secondnumber = new Scanner(System.in);

        System.out.println("Write first number : ");
        double a = firstnumber.nextDouble();

        System.out.println("Write second number");
        double b = secondnumber.nextDouble();

        System.out.println("Your addition result is " + (a + b));

    }
}
