import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InClassController implements ActionListener {
    private InClassView inClassView; // Gives us access to view


    public InClassController(InClassView inClassView){
        this.inClassView = inClassView;
        inClassView.addActionListenerButton(this);
        inClassView.addActionListenerBlvd(this);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("CRICK");
    }

}
