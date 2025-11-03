import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CustomerGUI  {
    private JFrame jFrame;
    private JPanel inputPanel, namePanel, gallonsPanel, typePanel, buttonPanel, mainPanel;
    private JTextField nameField, gallonsField;
    private JTextArea outputArea;
    private JButton billButton, showButton;
    private JRadioButton singleFamilyButton, duplexButton;
    private ButtonGroup typeGroup;
    private JScrollPane scrollPane;

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getGallonsField() {
        return gallonsField;
    }

    public CustomerGUI() {
        jFrame = new JFrame();
        mainPanel = new JPanel();

        //Top Input Panel
        inputPanel = new JPanel();

        // Name input
        namePanel = new JPanel();
        nameField = new JTextField(15);

        // Gallons input
        gallonsPanel = new JPanel();
        gallonsField = new JTextField(10);

        // Radio buttons
        typePanel = new JPanel();
        singleFamilyButton = new JRadioButton("Single Family");
        duplexButton = new JRadioButton("Duplex");
        typeGroup = new ButtonGroup();

        // Buttons
        buttonPanel = new JPanel();
        billButton = new JButton("Generate Bill");
        showButton = new JButton("Show All Customers");

        // Output
        outputArea = new JTextArea(10, 40);
        scrollPane = new JScrollPane(outputArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    }

    public void initializeUI(){
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

        // Name input
        namePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(new JLabel("Customer Name:"));
        namePanel.add(nameField);
        inputPanel.add(namePanel);

        // Gallons input
        gallonsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        gallonsPanel.add(new JLabel("Gallons Used:"));
        gallonsPanel.add(gallonsField);
        inputPanel.add(gallonsPanel);

        // Radio buttons
        typePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        typePanel.add(new JLabel("Customer Type:"));
        typeGroup.add(singleFamilyButton);
        typeGroup.add(duplexButton);
        typePanel.add(singleFamilyButton);
        typePanel.add(duplexButton);
        inputPanel.add(typePanel);

        // Buttons
        buttonPanel.add(billButton);
        buttonPanel.add(showButton);

        // Output
        outputArea.setEditable(false);

        // Main Layout
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(inputPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(scrollPane);

        jFrame.setLayout(new BorderLayout());
        jFrame.add(mainPanel, BorderLayout.CENTER);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public void addActionListenerGenerateBill(ActionListener listener){
        billButton.addActionListener(listener);
    }

    public void addActionListenerShowCustomers(ActionListener listener){
        showButton.addActionListener(listener);
    }

}