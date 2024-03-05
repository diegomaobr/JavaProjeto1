import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double areaQuadrado, ladoQuadrado, perimetroQuadrado;
        double areaCirculo, raioCirculo, pi = 3.1416;
        System.out.println("Digite o valor do lado quadrado:");
        ladoQuadrado = leitura.nextDouble();
        areaQuadrado = ladoQuadrado * ladoQuadrado;
        perimetroQuadrado = 4 * ladoQuadrado;
        System.out.println("Area do quadrado é: "+areaQuadrado);
        System.out.println("O perimetro do quadrado é: "+perimetroQuadrado);

        System.out.println("Digite raio do circulo");
        raioCirculo = leitura.nextDouble();
        areaCirculo = pi * (raioCirculo * raioCirculo);
        System.out.println("O valor da area do circulo é: "+areaCirculo);
    }
}
