/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package obersver_exam;

class AppTest {
    public static void main(String[] args){
        Eleve a = new Eleve("Bertrand", 150);
        Eleve b = new Eleve("Gertrude", 265);

        Educateur od = new Educateur();
        Enseignant on = new Enseignant();

        a.add(od);
        b.add(od);
        a.add(on);
        b.add(on);

        a.bonjour();
        a.notify(150);

        b.bonjour();
        b.notify(265);

    }
}
