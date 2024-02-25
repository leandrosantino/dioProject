import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        var scanner = new Scanner(System.in);

        System.out.println(" -- Bem vindo ao OneBank!");
        System.out.println(" -- Imforme seus dados para criar sua conta.");

        System.out.println();

        System.out.print("Nome: ");
        String name = scanner.next();

        System.out.print("Número da Conta: ");
        int agenceNumber = scanner.nextInt();

        System.out.print("Número da Agência: ");
        String accountNumber = scanner.next();

        System.out.print("Saldo: ");
        float balance = scanner.nextFloat();

        System.out.println();
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque",
                name, agenceNumber, accountNumber, balance);

        System.out.println();

        scanner.close();
    }
}
