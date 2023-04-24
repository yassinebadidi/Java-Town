package Western;

public class Histoire {
    public static void main(String[] args) {
        Humain ayoub = new Humain("Ayoub");
        //ayoub.sePresenter();
        Cowboy zoro = new Cowboy("Zoro");
        //zoro.sePresenter();
        Brigand bob = new Brigand("Bob");
        //zoro.tirer(alex);
        Dame sophie = new Dame("Sophie");
        Barman john = new Barman("John");
        Sherif alex = new Sherif("Alex");
        //sophie.quelEstTonNom();
        //alex.quelEstTonNom();
        //zoro.quelEstTonNom();
        bob.sePresenter();
        sophie.sePresenter();
        zoro.sePresenter();
        john.sePresenter();
        alex.chercher(bob);
        alex.coffrer(bob);
        alex.sePresenter();
    }
}
