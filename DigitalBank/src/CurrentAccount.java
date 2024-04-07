public class CurrentAccount extends Account {

    CurrentAccount(Client client) {
        super(client);
    }

    @Override
    public void printExtract() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.printExtract();
    }

}
