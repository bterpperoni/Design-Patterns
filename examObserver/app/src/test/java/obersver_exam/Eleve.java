package obersver_exam;

import java.util.ArrayList;

public class Eleve {

    private String name;
    private int matricule;

    protected ArrayList<I_observer> listObserver = new ArrayList<I_observer>();

    public Eleve(String name, int matricule) {
        this.name = name;
        this.matricule = matricule;
    }

    public void bonjour(){
        System.out.println("Je suis "+ name +" et mon matricule est : "+ matricule);
    }

    public void add(I_observer o){
        listObserver.add(o);
    }

    public void remove(I_observer o){
        listObserver.remove(o);
    }

    public void notify(int matricule){
        for(I_observer o : listObserver){
            o.update(matricule);
        }
    }

    
}
