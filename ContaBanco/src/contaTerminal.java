public class contaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = Integer.valueOf(args[0]);
        String agencia = args[1];
        String nome_Cliente = args[2];
        double saldo = Integer.valueOf(args[3]);

        System.out.println ("Por favor, digite o número da Agência !");
        System.out.println(agencia);

        System.out.println("Ola "+ nome_Cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta"+numero+"  e seu saldo de "+saldo+" já está disponível para saque.");
    }
}

