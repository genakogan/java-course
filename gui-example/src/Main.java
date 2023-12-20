import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the first panel with FlowLayout
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Create a label
        JLabel label = new JLabel("Select an option:");

        // Create a combo box with options
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Create a button
        JButton addButton = new JButton("Add Message");
        JButton clearButton = new JButton("Clear");

        // Set preferred size for the "Add Message" button
        addButton.setPreferredSize(new Dimension(120, 30));

        // Set preferred size for the "Clear" button
        clearButton.setPreferredSize(new Dimension(80, 30));
        // Create a text area for viewing selected items
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setEditable(false);

        // Create a text field for entering a message
        JTextField textField = new JTextField(20);

        // Add an action listener to the "Add Message" button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected item from the combo box
                String selectedOption = (String) comboBox.getSelectedItem();
                // Get the entered message from the text field
                String enteredMessage = textField.getText();
                // Append the selected item and entered message to the text area
                textArea.append(selectedOption + ": " + enteredMessage + "\n");
                // Clear the text field after clicking the button
                textField.setText("");
            }
        });

        // Add an action listener to the "Clear" button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear the contents of the text area
                textArea.setText("");
            }
        });

        // Add components to the first panel
        panel1.add(label);
        panel1.add(comboBox);
        panel1.add(new JLabel("Enter a message:"));
        panel1.add(textField);
        panel1.add(addButton);
        panel1.add(clearButton);
        panel1.add(textArea);

        // Create the second panel with BoxLayout
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        JLabel label2 = new JLabel("This is the second panel.");

        // Add a button to the second panel
        JButton secondPanelButton = new JButton("Button in Second Panel");

        // Add components to the second panel
        panel2.add(label2);
        panel2.add(secondPanelButton);

        // Set BoxLayout for the main frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(panel1);
        frame.add(panel2);

        // Set the frame visibility
        frame.setVisible(true);
    }
}