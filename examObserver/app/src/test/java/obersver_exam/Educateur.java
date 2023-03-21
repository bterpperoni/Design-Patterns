package obersver_exam;

public class Educateur implements I_observer{

    @Override
    public void update(int matricule) {
            if( 200 < matricule && matricule < 301){
                System.out.println("Je suis pris en charge par un educateur");
            }
    }
    
}
