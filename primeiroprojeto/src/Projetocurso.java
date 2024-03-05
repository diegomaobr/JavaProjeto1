import java.util.Scanner;

public class Projetocurso {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomePessoa, tipoConta = "Corrente";
        double saldoConta, valorEnviar, valorReceber;
        int condicao = 0;

        System.out.println("Digite seu nome:");
        nomePessoa = leitura.nextLine();
        System.out.println("Digite seu saldo:");
        saldoConta = leitura.nextDouble();

        while (condicao != 4) {
            System.out.println("\nBem vindo: "+nomePessoa);
            System.out.println("""
                    Operações
                    
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Enviar valor
                    4 - Sair
                    
                    Digite a operação desejada:
                    """);
            condicao = leitura.nextInt();
            if (condicao == 1){
                System.out.println("Saldo atualizado: " + saldoConta);
            }
            if (condicao == 2){
                System.out.println("Digite o valor a enviar: ");
                valorEnviar = leitura.nextDouble();
                System.out.println("Saldo atualizado R$: "+(saldoConta - valorEnviar));
            }
            if (condicao == 3){
                System.out.println("Digite o valor a receber: ");
                valorReceber = leitura.nextDouble();
                System.out.println("Saldo atualizado R$: "+(saldoConta + valorReceber));
            } if (condicao == 4){
                System.out.println("Sistema encerrado!");
            }
            System.out.println("Operação escolhida: "+condicao);
            System.out.println("************************************");
        }

    }

}
