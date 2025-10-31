import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InClassView {
    private JFrame jframe;
    private JButton button;
    public InClassView(){
        jframe = new JFrame();
        button=new JButton("MEEP");
        // Instantiate jswing widgets
    }

    public void initUI(){
        // Add to frames and panels meep
        jframe.add(button, BorderLayout.NORTH);

        jframe.setSize(500, 500);
        jframe.setVisible(true);
    }

    public void addActionListenerButton(ActionListener listener){
        button.addActionListener(listener);

    }
}
