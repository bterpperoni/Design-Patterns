import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.*;
/**
 * @author Eker Selim
 * @since 20/06/17
 */
public class Editor extends JFrame implements IObservateur{
    private Document doc;
    private JTextField text;

    public Editor(ISujet e){
        this.doc = (Document) e;
        this.init();
        this.doc.add(this);
        this.text.setText(this.doc.getText());
    }

    private void init(){
        this.setTitle("");
        this.setSize(100,100);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton Open = new JButton("Open");
        Open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Editor frame = new Editor(doc);
            }
        });
        text = new JTextField();
        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                doc.setText(text.getText());
            }
        });
        this.add(Open, BorderLayout.NORTH);
        this.add(text, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void update(ISujet e) {
        this.updateAffichage((Document) e);
    }

    private void updateAffichage(Document e){
        this.text.setText(e.getText());
    }
}
