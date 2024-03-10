import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class App {

    static double baseSalary = 2000.0;

    public static void main(String[] args) throws Exception {
        String[] candidatosSelecionados = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
        for (String candidato : candidatosSelecionados) {
            makeContact(candidato);
        }
    }

    static void makeContact(String candidate) {

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = toMeet();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidate + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidate + ", NÚMERO MAXIMO TENTATIVAS "
                    + tentativasRealizadas + " REALIZADA");

    }

    static void printCandidates() {
        String[] candidates = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println("O candidato de nº " + (i + 1) + " é " + candidates[i]);
        }

        System.out.println("Forma abreviada de interação for each");
        for (String candidate : candidates) {
            System.out.println(" O candidato selecionado foi " + candidate);
        }

    }

    static void selectedCandidates() {
        String[] candidates = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };
        int candidatesAmount = 0;
        int index = 0;
        while (candidatesAmount < 5 && index < candidates.length) {
            String candidate = candidates[index];
            double salary = salaryGenerator();

            System.out.println("O candidato " + candidate + " solicitou um salário de " + salary);
            if (baseSalary >= salary) {
                System.out.println("O candidato " + candidate + " foi seleciona para a vaga");
                candidatesAmount++;
            }
            index++;
        }

    }

    static void analyzeSalary(double salary) {
        if (baseSalary > salary) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (baseSalary == salary) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }

    static double salaryGenerator() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean toMeet() {
        return new Random().nextInt(3) == 1;
    }

}
