import javax.swing.*;
import javax.swing.text.BoxView;
import java.awt.*;

public class InClassGui {
    private JFrame jFrame;

    private JButton freakybutton;
    private JPanel freakypanel;
    private JTextField textbox;
    private JTextArea moola;
    private JCheckBox all;
    private JRadioButton goon;



    public InClassGui(){
        jFrame = new JFrame();
        // Event src aka button, list, etc
        // Event (click, entered list, wvatever
        // Listener run methud when do the EVENT




        /*
        textbox = new JTextField();
        textbox.setText("Some Sex");
        jFrame.add(textbox);

        moola = new JTextArea(4,10);
        moola.append("Hello my baby\n hello my darling\n hello my ragtime girl");
        jFrame.add(moola, BorderLayout.EAST);
        moola.setFont(new Font("Comic Sans", Font.BOLD, 25));


        freakypanel = new JPanel();
        freakypanel.setLayout(new BoxLayout(freakypanel, BoxView.Y_AXIS));


        freakypanel.add(new JButton("a"));
        freakypanel.add(new JButton("b"));
        freakypanel.add(new JButton("c"));
        freakypanel.add(new JButton("d"));
        freakypanel.add(new JButton("e"));
        freakypanel.add(new JButton("f"));
        freakypanel.add(new JButton("g"));
        jFrame.add(freakypanel);
        freakypanel.setPreferredSize(new Dimension(500, 100));

        /*
        freakybutton = new JButton("Touch Me");
        jFrame.add(freakybutton);
        */
/*
        // Border layout N,E,W,S Centre
        JButton north = new JButton("Norte");
        JButton south = new JButton("Sudre");
        JButton east = new JButton("easte");
        JButton west = new JButton("weste");
        JButton centre = new JButton("cdenter");

        jFrame.add(north, BorderLayout.NORTH);
        jFrame.add(south, BorderLayout.SOUTH);
        jFrame.add(east, BorderLayout.EAST);
        jFrame.add(west, BorderLayout.WEST);
        jFrame.add(centre, BorderLayout.CENTER);
*/

        // These two things for it to show up in window
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);

        //

    }


}
