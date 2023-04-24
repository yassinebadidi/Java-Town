package Western;

public class Humain {
    private String nom;
    private String boisson ="Eau";

    public Humain(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public String getBoisson() {
        return boisson;
    }

     static void parler(Humain humain, String text){
        System.out.println("("+ humain.getNom()+") - "+text);
    }

    public void sePresenter(){
        System.out.println("("+this.getNom()+")-Bonjour, je suis "+getNom()+ " et je bois "+getBoisson()+ ":)");
    }

    public void boir(){

    }
}
