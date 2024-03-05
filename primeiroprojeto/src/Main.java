//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esse é o Screem Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaFilme = 8.9;
        System.out.println("Nota do Filme: " + notaFilme);
        double media = (8.9 + 6)/2;
        System.out.println("Media do Filme: "+media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com gala dos anos 90
                Filme bom!
                Ano de lancamento:
                """ +anoDeLancamento;
        System.out.println(sinopse);

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}