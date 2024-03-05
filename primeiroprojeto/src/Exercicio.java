public class Exercicio {
    public static void main(String[] args){
        double nota1, nota2;
        double media;
        int mediaInteiro;
        char letra;
        String palavra;
        nota1 = 5.5;
        nota2 = 6;
        media = (nota1 + nota2) /2;
        mediaInteiro = (int) (media);
        letra = 'W';
        palavra = """
                Teste de concatenação
                Exercicio 3
                Palavra + Char
                """ + letra;
        double precoProduto;
        int quantidade;
        precoProduto = 4.99;
        quantidade = 2;
        double valorEmDolares;
        valorEmDolares = 4.94;
        double real;
        real = 1;
        double precoOriginal;
        precoOriginal = 9.99;
        double percentualDesconto;
        percentualDesconto = 10;
        double valorFinaldoProduto;
        double valorDoDesconto = (precoOriginal * percentualDesconto) /100;
        valorFinaldoProduto = precoOriginal - valorDoDesconto;
        System.out.println("A media é: "+media);
        System.out.println("A media convertira em inteiro é: "+mediaInteiro);
        System.out.println(palavra);
        System.out.println("Valor total dos produtos é: " +precoProduto * quantidade);
        System.out.println("Conversao do Dolar em Real: "+valorEmDolares * real);
        System.out.println("Preço original do produto: "+precoOriginal+" Desconto: "+percentualDesconto+ " % "+" Valor final: "+valorFinaldoProduto);
    }
}
