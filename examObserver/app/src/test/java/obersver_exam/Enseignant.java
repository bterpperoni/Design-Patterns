package obersver_exam;

public class Enseignant implements I_observer{

    

    @Override
    public void update(int matricule) {
       
        if( 100 < matricule && matricule < 201){
            System.out.println("Je suis pris en charge par un enseignant");
        }
    }
    
}
