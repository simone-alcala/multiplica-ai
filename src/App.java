import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número inteiro: ");
            int number = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.print(number + " x " + i + " = " + result + "\n");
            }
        } catch (InputMismatchException e) {
            System.out.println("Número inválido =/");
        } catch (Exception e) {
            System.out.println("Erro não detectado... oO");
        } finally {
            scanner.close();
        }
    }

}
