/**
 * @author Eker Selim
 * @since 20/06/17
 */
public class ContextAlgo {
    private IStrategy Algo;

    public ContextAlgo(){
        this.Algo = new QuickSort();
    }

    public void setAlgo(IStrategy e){
        this.Algo = e;
    }

    public void trier(int[] e){
        this.Algo.tri(e);
    }
}
