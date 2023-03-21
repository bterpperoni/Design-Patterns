/**
 * @author Eker Selim
 * @since 20/06/17
 */
public class Main {
    public static void main(String[] args) {
        int[] tabATrier = { 20, 30, 15, 5, 25 };

        ContextAlgo algo = new ContextAlgo();
        algo.trier(tabATrier);
        for (int i = 0; i < tabATrier.length; i+=1) {
            System.out.printf(tabATrier[i]+" ");
        }
        System.out.printf("\n");

        algo.setAlgo(new MergeSort());
        algo.trier(tabATrier);
        for (int i = 0; i < tabATrier.length; i+=1) {
            System.out.printf(tabATrier[i]+" ");
        }
        System.out.printf("\n");
    }
}
