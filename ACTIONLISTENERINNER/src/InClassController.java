import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InClassController {
    private InClassView inClassView; // Gives us access to view


    public InClassController(InClassView inClassView){
        this.inClassView = inClassView;

        inClassView.addActionListenerButton(new ActionListenerButton());
        inClassView.addActionListenerBlvd(new ActionListenerBUTT());
    }

    private class ActionListenerButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
           System.out.println("YOU HIT THE TOP ONE!!");

        }
    }

    private class ActionListenerBUTT implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Freak you bro");
        }
    }



}
