package Western;

public class Cowboy extends Humain{
    int popularite = 0;
    String adjectif ="Le vaillant";

    public Cowboy(String nom) {
        super(nom);
    }

    public String getNom(){
        return super.getNom();
    }
    public String getBoisson(){
        return "du whisky";
    }

    public String getAdjectif() {
        return adjectif;
    }

    public void quelEstTonNom(){
        System.out.println(this.getNom());
    }

    public void liberer(Dame dame){
        System.out.println("Vous êtes libre ma chérie " + dame.getNom());
        this.popularite++;
    }
    public void sexclamer(){
        System.out.println("Prend ça rascal !");
    }
    public void tirer(Brigand brigand){
        System.out.println(this.adjectif + " "+ this.getNom()+" tire sur "+brigand.getNom()+" . PAN !");
    }

    public void sePresenter(){
        super.sePresenter();
        System.out.println("("+this.getNom()+")- Tout le monde m'appelle "+getAdjectif()+", ma popularité est de niveau "+this.popularite);
    }
}
