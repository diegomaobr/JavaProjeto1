public class Condicional {
    public static void main(String[] args) {
        int anoLacamento = 1990;
        boolean incluido = true;
        double notaDoFilme = 9.1;
        String tipoPlano = "plus";

        if (anoLacamento >= 2022){
            System.out.println("Lancamento que os clientes estão curtindo!");
        } else {
            System.out.println("Fime retrô que vale a pena");
        }
        if (incluido && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Pagamento pendente.");
        }
    }
}
