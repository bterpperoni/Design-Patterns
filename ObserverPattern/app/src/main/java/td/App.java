/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package td;

/* Quilodran Jimenez Loris */

public class App {
    
    public static void main(String[] args) {
        
        etudiant ed1 = new etudiant("toto", 123);
        etudiant ed2 = new etudiant("tutu",456);

        enseignant e1 = new enseignant("Tricarico");
        coordinateur c1 = new coordinateur("Pietrzak");

        ed1.addObs(e1);
        ed1.addObs(c1);
        ed2.addObs(e1);
        ed2.addObs(c1);

        ed1.setName("tata");
        ed2.setMatricule(789);
    }


}
