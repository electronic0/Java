import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        System.out.println("O sucessor de " + num + " é " + (num + 1) + ", e o antecessor de " + num + " é " + (num - 1));
    }
}