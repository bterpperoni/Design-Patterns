/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package examstrategy;

public class App {

    public static void main(String[] args){

        ContextFile context = new ContextFile();

        context.setStrategy(new RarStrategy());
        context.afficherCompression();
        
        context.setStrategy(new ZipStrategy());
        context.afficherCompression();


    }

    
}
