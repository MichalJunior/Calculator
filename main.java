import addition.Addition;
import com.sun.jdi.ClassType;
import substraction.Substraction;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            Calculations();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("unrecognized type of data");

        }
        }


    private static void Calculations() {
        System.out.println("Welcome in my first calculator");
        boolean repead = true;
        while (repead = true) {
            introducing();

            Addition resultofaddition = new Addition();
            Substraction resultofsubstraction = new Substraction();
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();

            if (choose == 1) {
                resultofaddition.addition();
            }
            if (choose == 2) {
                resultofsubstraction.substraction();
            }
            if (choose != 1 && choose != 2) {
                System.out.println("         Wrong number");
            }


        }
    }

    private static void introducing() {

        System.out.println("-----Choose type of calculation---insert number below-----");
        System.out.print("1-addition/2-substraction :");
    }
}
