import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Por favor digite seu nome");
        String nome_Cliente = scanner.next();

        System.out.println("Por favor digite seu nome");
        Double saldo = 237.48;

       
        System.out.println("Ola " + nome_Cliente + ",obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ",conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
    
        


    }
}
