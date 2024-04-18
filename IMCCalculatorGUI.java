import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMCCalculatorGUI extends JFrame implements ActionListener {
    private JLabel label1, label2, label3, label4;
    private JTextField textField1, textField2, textField3, textField4;
    private JButton calculateButton;
    private JRadioButton manRadioButton, girlRadioButton;
    private ButtonGroup genderButtonGroup;

    private IMC imc;

    public IMCCalculatorGUI() {
        setTitle("Calculadora IMC");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        label1 = new JLabel("Estatura (m): ");
        textField1 = new JTextField();
        label2 = new JLabel("Peso (kg): ");
        textField2 = new JTextField();
        inputPanel.add(label1);
        inputPanel.add(textField1);
        inputPanel.add(label2);
        inputPanel.add(textField2);

        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        manRadioButton = new JRadioButton("Hombre");
        girlRadioButton = new JRadioButton("Mujer");
        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(manRadioButton);
        genderButtonGroup.add(girlRadioButton);
        radioPanel.add(manRadioButton);
        radioPanel.add(girlRadioButton);

        JPanel resultPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        label3 = new JLabel("IMC: ");
        textField3 = new JTextField();
        textField3.setEditable(false);
        label4 = new JLabel("Clasificación: ");
        textField4 = new JTextField();
        textField4.setEditable(false);
        resultPanel.add(label3);
        resultPanel.add(textField3);
        resultPanel.add(label4);
        resultPanel.add(textField4);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        calculateButton = new JButton("Calcular");
        calculateButton.addActionListener(this);
        buttonPanel.add(calculateButton);

        add(inputPanel, BorderLayout.NORTH);
        add(radioPanel, BorderLayout.CENTER);
        add(resultPanel, BorderLayout.CENTER); // Cambiado a CENTER para ocupar más espacio
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            if (!textField1.getText().isEmpty() && !textField2.getText().isEmpty()) {
                double estatura = Double.parseDouble(textField1.getText());
                double peso = Double.parseDouble(textField2.getText());
                imc = new IMC(peso, estatura);
                textField3.setText(String.valueOf(imc.getIMC()));
                textField4.setText(imc.getClasificacion());
            } else {
                textField3.setText("Error: ¡Debe ingresar la estatura y peso de la persona!");
                textField4.setText(""); // Limpiar el campo de clasificación en caso de error
            }
        }
    }

    public static void main(String[] args) {
        new IMCCalculatorGUI();
    }
}
