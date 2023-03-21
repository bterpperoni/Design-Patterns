/**
 * @author Eker Selim
 * @since 20/06/17
 */
public class Document extends ISujet{
    private String text = "";

    public Document(){
        super();
    }

    public void setText(String e){
        this.text = e;
        this.notifier();
    }

    public String getText(){
        return this.text;
    }
}
