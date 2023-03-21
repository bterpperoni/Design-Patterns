package td;

public class enseignant implements observateur {
    
    String name;
    String type="e";

    public enseignant(String n){
        this.name=n;
    }
    @Override
    public String getType(){
        return this.type;
    }

    @Override
    public void update() {
        System.out.println("L'enseignant "+this.name+" est prévenu du changement de nom");
    }
}
