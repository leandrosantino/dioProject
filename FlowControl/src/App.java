import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        try {
            count(parametroUm, parametroDois);
        } catch (InvalidParamsIntervalException exception) {
            System.out.println(exception.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void count(int parametroUm, int parametroDois) throws InvalidParamsIntervalException {
        if (parametroUm > parametroDois) {
            throw new InvalidParamsIntervalException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
