import java.util.Scanner;

public class Project1 {
 public static void Sum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int number1 = sc.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int number2 = sc.nextInt();

        int sum = number1 + number2;
        System.out.println("A soma é : " + sum);

        sc.close();
    }
}
