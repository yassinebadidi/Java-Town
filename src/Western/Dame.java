package Western;

public class Dame extends Humain{
    String couleurRobe = "Rouge";
    String etat = "Libre";     public Dame(String nom) {
        super(nom);
    }

    public String getNom(){
        return "Miss "+super.getNom();
    }
    public String getBoisson(){
        return "du lait";
    }
    public void quelEstTonNom(){
        System.out.println(this.getNom());
    }

    public void seFaireEnlever(){
        System.out.println(this.getNom()+" Hurle :'(");
        this.etat = "Captive";
    }
    public void seFaireLiberer(Cowboy cowboy){
        System.out.println("Merci "+cowboy.getNom()+"!");
        this.etat = "Libre";
    }
    public void changerRobe(String couleurRobe){
        this.couleurRobe = couleurRobe;
        System.out.println("Regardez ma nouelle robe "+ couleurRobe +" !");
    }

    public void sePresenter(){
        super.sePresenter();
        System.out.println("("+this.getNom()+")- Ma robe est "+this.couleurRobe);
        if (this.etat.equals("Libre")){
            System.out.println("("+this.getNom()+")- Je suis "+this.etat);
        } else if (this.etat.equals("Captive")) {
            System.out.println("("+this.getNom()+")- Je suis "+this.etat);
        }



    }
}

