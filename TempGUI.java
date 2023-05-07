import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempGUI extends JFrame {
    private JComboBox<String> inputUnitsComboBox;
    private JComboBox<String> outputUnitsComboBox;
    private JTextField tempTextField;
    private JButton convertButton;
    private JTextField resultTextField;

    public TempGUI() {
        // Set up the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));
        setLocationRelativeTo(null);

        // Create the components
        JLabel inputUnitsLabel = new JLabel("Input Units:");
        String[] inputUnits = {"Fahrenheit", "Celsius", "Kelvin"};
        inputUnitsComboBox = new JComboBox<>(inputUnits);
        JLabel outputUnitsLabel = new JLabel("Output Units:");
        String[] outputUnits = {"Fahrenheit", "Celsius", "Kelvin"};
        outputUnitsComboBox = new JComboBox<>(outputUnits);
        JLabel tempLabel = new JLabel("Temperature:");
        tempTextField = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        resultTextField = new JTextField();
        resultTextField.setEditable(false);
        convertButton = new JButton("Convert");

        // Add the components to the frame
        add(inputUnitsLabel);
        add(inputUnitsComboBox);
        add(outputUnitsLabel);
        add(outputUnitsComboBox);
        add(tempLabel);
        add(tempTextField);
        add(resultLabel);
        add(resultTextField);
        add(new JLabel()); // Empty label for spacing
        add(convertButton);

        // Add an action listener to the convert button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputUnits = (String) inputUnitsComboBox.getSelectedItem();
                String outputUnits = (String) outputUnitsComboBox.getSelectedItem();
                double temperature = Double.parseDouble(tempTextField.getText());
                double result = TempConverter.convertAll(inputUnits, outputUnits, temperature);
                resultTextField.setText(String.format("%.2f", result));
            }
        });

        // Add an action listener to the input units combo box
        inputUnitsComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) inputUnitsComboBox.getSelectedItem();
                // Do something with the selected option
            }
        });

        // Add an action listener to the output units combo box
        outputUnitsComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) outputUnitsComboBox.getSelectedItem();
                // Do something with the selected option
            }
        });
    }
    public static void main(String[] args) {
        TempGUI gui = new TempGUI() ;
        gui.setVisible(true);
    }
}


