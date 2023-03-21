package td;

public class coordinateur implements observateur {

    String name;
    String type="c";

    public coordinateur(String n){
        this.name=n;
    }

    @Override
    public String getType(){
        return this.type;
    }

    @Override
    public void update() {
        System.out.println("Le coordinateur "+this.name+" est prevenu du changement de matricule");
    }
    
}
