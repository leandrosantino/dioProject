public class SavingsAccount extends Account {

    SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printExtract() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.printExtract();
    }

}
