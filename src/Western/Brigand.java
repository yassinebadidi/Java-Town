package Western;

public class Brigand extends Humain {
    public String look = "Méchant";
    public int nbrDamesEnleve;
    public int recompense = 100;
    String etat;

    public Brigand(String nom) {
        super(nom);
    }

    public int getRecompense() {
        return recompense;
    }

    public String getNom(){
        return super.getNom();
    }
    public String getBoisson(){
        return "du tord-boyaux";
    }


    public void sePresenter(){
        super.sePresenter();
        System.out.println("("+this.getNom()+")- J'ai l'air "+this.look+" et j'ai kidnappé "+this.nbrDamesEnleve+ " dames");
        System.out.println("("+this.getNom()+")- Ma tête est mise à prix à "+ this.recompense+"$");
    }

    public void quelEstTonNom(){
        System.out.println("-" + this.getNom()+ " le "+ this.look);
    }
    public void kidnapper(Dame dame){
        System.out.println(dame.getNom()+" tu es mienne désormais.");
        this.nbrDamesEnleve++;
    }

    public void seFaireEmprisone(Cowboy cowboy){
        System.out.println(cowboy.getNom() + "tu m'as eu !");
        this.etat = "En prison";
    }
}
