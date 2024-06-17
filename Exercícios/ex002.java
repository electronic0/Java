import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual é o seu nome? ");
        String nome = input.nextLine();
        System.out.println("Prazer de conhecer, " + nome);
    }
}