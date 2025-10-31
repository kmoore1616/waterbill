import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InClassView {
    private JFrame jframe;
    private JButton button;
    private JButton otherbutt;

    public InClassView(){
        jframe = new JFrame();
        button=new JButton("MEEP");
        otherbutt=new JButton("124 Blvd");
        // Instantiate jswing widgets
    }

    public void initUI(){
        // Add to frames and panels meep
        jframe.add(button, BorderLayout.NORTH);
        jframe.add(otherbutt);

        jframe.setSize(500, 500);
        jframe.setVisible(true);
    }
    // What the fuck is this bro. Theres got to be a better way!?!?!
    public void addActionListenerButton(ActionListener listener){
        button.addActionListener(listener);
    }
    public void addActionListenerBlvd(ActionListener listener){
        otherbutt.addActionListener(listener);
    }
}
