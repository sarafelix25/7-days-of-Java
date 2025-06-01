import java.util.Scanner;

public class Project1 {
 public static void Sum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();

        double sum = number1 + number2;
        System.out.println("A soma é : " + sum);

        sc.close();
    }
}
