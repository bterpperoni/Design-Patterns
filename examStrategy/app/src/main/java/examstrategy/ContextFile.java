package examstrategy;

public class ContextFile {

    protected String nom = "Mon_Fichier";
    protected Strategy strat;


    public void setStrategy(Strategy strat){
        this.strat = strat;
    }

    public void afficherCompression(){
        System.out.println(this.nom + strat.Compression());
    }
    
}
