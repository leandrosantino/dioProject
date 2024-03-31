
public class Iphone implements Phone, Ipod, InternetDevice {

    @Override
    public void call() {
        System.out.println("realizando chamanda ...");
    }

    @Override
    public void sendMessage() {
        System.out.println("Enviando menssagem ...");
    }

    @Override
    public void playMusic() {
        System.out.println("Tocando musica ...");
    }

    @Override
    public void openWebSite() {
        System.out.println("Abrindo site ...");
    }

}
