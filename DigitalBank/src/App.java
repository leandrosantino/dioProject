public class App {
    public static void main(String[] args) throws Exception {
        Client leandro = new Client();
        leandro.setName("Leandro");

        Account ca = new CurrentAccount(leandro);
        Account sa = new SavingsAccount(leandro);

        ca.deposit(240.50);
        ca.transfer(120.20, sa);

        ca.printExtract();
        sa.printExtract();
    }
}
