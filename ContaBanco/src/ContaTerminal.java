import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Bem Vindo ao seu Banco");

        System.out.println ("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println ("Digite o numero da agencia: ");
        String numeroAgencia = scanner.next();


        System.out.println ("Digite seu nome: ");
        scanner.nextLine();
        String nomeUsuario = scanner.nextLine().toUpperCase();

        System.out.println ("Digite o seu saldo: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá "+nomeUsuario+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque.");
    }
}