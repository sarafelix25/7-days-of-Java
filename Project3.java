import java.util.Scanner;

public class Project3 {
    public static void NumbersQuantities() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = sc.nextInt();

        if (number>=1 && number <=9) {
             System.out.print("Este número tem 1 dígito.");
        } else if (number>=10 && number<=100) {
             System.out.print("Este número tem 2 dígitos.");
        } else if (number>=100 && number<=1000) {
             System.out.print("Este número tem 3 dígitos.");
        } else if (number>=1000 && number<=10000) {
             System.out.print("Este número tem 4 dígitos.");
        } else if (number>=10000 && number<=100000000) {
             System.out.print("Este número tem 5 dígitos.");
        } else {
            System.out.print("Este número tem 5 dígitos ou mais.");
        }

        sc.close();
    }
}
