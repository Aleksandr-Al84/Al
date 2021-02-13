import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.stream.Stream;

public class AdvancedCalc {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Введите число: ");

        double num1 = num.nextDouble();
        System.out.println("Введите знак: ");
        System.out.println("     +" + "   - суммирование");
        System.out.println("     -" + "   - вычитание");
        System.out.println("     *" + "   - умножение");
        System.out.println("     /" + "   - деление");
        System.out.println("     div" + " - целочисленное деление");
        System.out.println("     mod" + " - остаток от деления");
        System.out.println("     ^" + "   - возведение в степень");

        String num2 = new Scanner(System.in).nextLine();


        String plus = "+";
        String minus = "-";
        String multiply = "*";
        String division = "/";
        String intDivision = "div";
        String remainder = "mod";
        String power = "^";


        if (plus.equals(num2)) {
            System.out.println("Введите второе число: ");
        } else if (minus.equals(num2)) {
            System.out.println("Введите второе число: ");
        } else if (multiply.equals(num2)) {
            System.out.println("Введите второе число: ");
        } else if (division.equals(num2)) {
            System.out.println("Введите второе число: ");
        } else if (intDivision.equals(num2)) {
            System.out.println("Введите второе число: ");
        } else if (remainder.equals(num2)) {
            System.out.println("Введите второе число: ");
        } else if (power.equals(num2)) {
            System.out.println("Введите степень числа: ");
        }

        while (!plus.equals(num2) && !minus.equals(num2) && !multiply.equals(num2) && !division.equals(num2) &&
                !intDivision.equals(num2) && !remainder.equals(num2) && !power.equals(num2)) {
            System.out.println("Неверный знак! Попробуйте снова");
            num2 = new Scanner(System.in).nextLine();
            if (plus.equals(num2)) {
                System.out.println("Введите второе число: ");
            } else if (minus.equals(num2)) {
                System.out.println("Введите второе число: ");
            } else if (multiply.equals(num2)) {
                System.out.println("Введите второе число: ");
            } else if (division.equals(num2)) {
                System.out.println("Введите второе число: ");
            } else if (intDivision.equals(num2)) {
                System.out.println("Введите второе число: ");
            } else if (remainder.equals(num2)) {
                System.out.println("Введите второе число: ");
            } else if (power.equals(num2)) {
                System.out.println("Введите степень числа: ");
            }
        }

        double num3 = new Scanner(System.in).nextDouble();

        System.out.println("=");

        if (plus.equals(num2)) {
            System.out.println(num1 + num3);
        } else if (minus.equals(num2)) {
            System.out.println(num1 - num3);
        } else if (multiply.equals(num2)) {
            System.out.println(num1 * num3);
        } else if (division.equals(num2)) {
            System.out.println(num1 / num3);
            if (num3 == 0.0) {
                System.out.println("На ноль делить нельзя");
            }

        } else if (intDivision.equals(num2)) {
            int num4 = (int) num1;
            int num5 = (int) num3;


            if (num5 == 0.0) {
                double p = (double) num4 / (double) num5;
                System.out.println("На ноль делить нельзя");
            }
            else System.out.println(num4 /num5);


        } else if (remainder.equals(num2)) {

            System.out.println(num1 % num3);
        }
        if (power.equals(num2)) {

            int m = 1;
            int n = (int) num1;
            for (int i = 1; i <= num3; i++) {
                m = (int) (m * n);
            }
            System.out.println(m);
        }
    }

}
