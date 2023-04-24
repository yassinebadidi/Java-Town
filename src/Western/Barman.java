package Western;

public class Barman extends Humain{
    private String nomBar;
    public Barman(String nom){
        super(nom);
    }

    public Barman(String nom, String nomBar) {
        super(nom);
        this.nomBar = nomBar;
    }

    public String getBoisson(){
        return "vin";
    }

    public String getNomBar() {
        this.nomBar = "Chez " + getNom();
        return this.nomBar;
    }

    public void sePresenter(){
        super.sePresenter();
        System.out.println("("+this.getNom()+")- Je suis le barman et mon bar est appellé : "+this.getNomBar()+", Coco ");
    }
}
