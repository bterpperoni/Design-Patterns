package td;

import java.io.File;
import java.util.ArrayList;

public class compresseur {
    
    strategie str;
    ArrayList<File> aCompresser;

    public void setStrategie(strategie strat){
        this.str = strat;
    }

    public void setFichier(ArrayList<File> f){
        this.aCompresser = f;
    }

    public void creerArchive(){
        for (File f : aCompresser){
            str.creerArchive();
            System.out.println(f.getName());
        }
    }

    public compresseur(){
        this.str = new strategieRAR();
    }

    
}
