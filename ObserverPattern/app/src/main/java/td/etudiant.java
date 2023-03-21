package td;
import java.util.ArrayList;

public class etudiant {

    String name;
    Integer matricule;
    ArrayList<observateur> ce = new ArrayList<observateur>();

    public etudiant(String n , Integer mat ){
        this.name=n;
        this.matricule=mat;
    }

    public void addObs(observateur obs){

        ce.add(obs);
    }

    public void setName(String n){
        this.name=n;
        for (observateur e : ce){
            if(e.getType()=="e"){
                e.update();
            }
        }
    }

    public void setMatricule(Integer mat){
        this.matricule=mat;
        for(observateur e : ce){
            if(e.getType()=="c"){
                e.update();
            }
        }
    }

    
}
