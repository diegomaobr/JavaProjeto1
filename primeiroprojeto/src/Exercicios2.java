import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double numeroDigitado;
        System.out.println("Digite um numero:");
        numeroDigitado = leitura.nextDouble();
        if (numeroDigitado > 0){
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero negativo");
        }
    }
}
