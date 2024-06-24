import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = input.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = input.nextInt();
        System.out.println("A soma dos números " + n1 + " e " + n2 + " vale " + (n1 + n2));
    }
}