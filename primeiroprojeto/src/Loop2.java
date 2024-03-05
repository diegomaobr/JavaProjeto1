import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int quantidade = 0;
        while (nota != -1) {
            System.out.println("Digite sua nota do filme: ");
            nota = leitura.nextDouble();
            if (nota != -1){
                media += nota;
                quantidade++;
            }
        }
        System.out.println("Media de avaliacoes: "+media/quantidade);
    }
}
