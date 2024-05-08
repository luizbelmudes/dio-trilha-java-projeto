import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu primeiro nome:");
        String primeiroNome = scanner.next();

        System.out.println("Digite seu primeiro sobrenome:");
        String primeiroSobrenome = scanner.next();

        String nomeCompleto = primeiroNome + " " + primeiroSobrenome;

        System.out.println("Por favor digite o numero da Agencia!");
        String agencia = scanner.next();

        System.out.println("Agora digite o número da Conta!");
        int conta = scanner.nextInt();

        System.out.println("Digite o Saldo contido na conta");
        double saldo = scanner.nextDouble();


        System.out.println("Olá, " + nomeCompleto + ", obrigado por criar uma conta em nosso banco! Sua agencia é " + agencia + ", conta " + conta + 
        " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
