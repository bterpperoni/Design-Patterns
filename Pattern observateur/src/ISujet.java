import java.util.ArrayList;
/**
 * @author Eker Selim
 * @since 20/06/17
 */
public abstract class ISujet {
    private ArrayList<IObservateur> obs;

    public ISujet(){
        this.obs = new ArrayList<IObservateur>();
    }

    public void add(IObservateur e){
        this.obs.add(e);
    }

    public void remove(IObservateur e){
        this.obs.add(e);
    }

    public void notifier(){
        for (IObservateur e : obs) {
            e.update(this);
        }
    }
}
