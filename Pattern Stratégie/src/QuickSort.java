import java.util.Arrays;
/**
 * @author Eker Selim
 * @since 20/06/17
 */
public class QuickSort implements IStrategy{
    @Override
    public void tri(int[] e) {
        Arrays.sort(e);
    }
}
