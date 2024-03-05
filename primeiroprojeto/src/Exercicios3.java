import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroA = 0;
        int numeroB = 0;
        System.out.println("Digite um numero inteiro A: ");
        numeroA = leitura.nextInt();
        System.out.println("Digite um numero inteiro B: ");
        numeroB = leitura.nextInt();
        if (numeroA == numeroB){
            System.out.println("Os numeros são iguais!");
        } else {
            System.out.println("Os numeros são diferentes!");
        }
    }
}
