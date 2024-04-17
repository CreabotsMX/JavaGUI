import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometricCalculatorGUI extends JFrame implements ActionListener 
{
    private JLabel label1, label2;
    private JTextField textField1, textField2, textField3;
    private JButton calculateButton;
    private JRadioButton squareRadioButton, rectangleRadioButton, triangleRadioButton, circleRadioButton;
    private ButtonGroup figuresButtonGroup;
    
    // Variables para almacenar los objetos de figuras seleccionados
    private Cuadrado cuadrado;
    private Rectangulo rectangulo;
    private Triangulo triangulo;

    public GeometricCalculatorGUI() 
    {
        setTitle("Calculadora Figuras Geometricas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        label1 = new JLabel();
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        
        label2 = new JLabel();
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField3.setEditable(false);
        
        calculateButton = new JButton("Calcular");
        
        squareRadioButton = new JRadioButton("Cuadrado");
        rectangleRadioButton = new JRadioButton("Rectangulo");
        triangleRadioButton = new JRadioButton("Triangulo Rectangulo");
        circleRadioButton = new JRadioButton("Circulo");

        figuresButtonGroup = new ButtonGroup();
        figuresButtonGroup.add(squareRadioButton);
        figuresButtonGroup.add(rectangleRadioButton);
        figuresButtonGroup.add(triangleRadioButton);
        figuresButtonGroup.add(circleRadioButton);

        squareRadioButton.addActionListener(this);
        rectangleRadioButton.addActionListener(this);
        triangleRadioButton.addActionListener(this);
        circleRadioButton.addActionListener(this);
        calculateButton.addActionListener(this);

        // Poner los componentes en el Frame, en el orden que quiero que aparezcan
        add(squareRadioButton);
        add(rectangleRadioButton);
        add(triangleRadioButton);
        add(circleRadioButton);
        
        // Agregamos espacio adicional de una fila con dos columnas
        add(new JLabel()); // Espacio vacío
        add(new JLabel()); // Espacio vacío
        
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        
        // Agregamos espacio adicional de una fila con dos columnas
        add(new JLabel()); // Espacio vacío
        add(new JLabel()); // Espacio vacío
        
        add(calculateButton);
        add(textField3);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == calculateButton) 
        {           
            if (squareRadioButton.isSelected()) 
            {
                if(!textField1.getText().isEmpty())
                {
                    double lado = Double.parseDouble(textField1.getText());
                    cuadrado = new Cuadrado(lado);
                    textField3.setText(cuadrado.toString());
                }
                else 
                {
                    textField3.setText("Error: ¡Debe ingresar el lado del cuadrado!");
                }
            }
            
            else if (rectangleRadioButton.isSelected()) 
            {
                if(!textField1.getText().isEmpty() && !textField2.getText().isEmpty())
                {
                    double base = Double.parseDouble(textField1.getText());
                    double altura = Double.parseDouble(textField2.getText());
                    rectangulo = new Rectangulo(base,altura);
                    textField3.setText(rectangulo.toString());
                }
                
                else
                {
                    textField3.setText("Error: ¡Debe ingresar la base y la altura del rectángulo!");
                }
                
            }
            
            else if (triangleRadioButton.isSelected()) 
            {
                if(!textField1.getText().isEmpty() && !textField2.getText().isEmpty())
                {
                    double base = Double.parseDouble(textField1.getText());
                    double altura = Double.parseDouble(textField2.getText());
                    triangulo = new TrianguloRectangulo(base,altura);
                    textField3.setText(triangulo.toString());
                }
                
                else
                {
                    textField3.setText("Error: ¡Debe ingresar la base y la altura del triangulo!");
                }
            }
            
            //Circulo
            else if (circleRadioButton.isSelected()) 
            {
                
            }
            
            else
            {
                textField3.setText("Selecciona una opcion");
            }
        } 
        
        else 
        {
            if (squareRadioButton.isSelected()) 
            {
                label1.setText("Lado:");
                label2.setText("");
                textField1.setText("0");
                textField2.setText("0");
                textField3.setText("");
                textField1.setVisible(true);
                textField2.setVisible(false);            
            } 
            else if (rectangleRadioButton.isSelected()) 
            {
                label1.setText("Base:");
                label2.setText("Altura:");
                textField1.setText("0");
                textField2.setText("0");
                textField3.setText("");
                textField1.setVisible(true);
                textField2.setVisible(true);              
            } 
            else if (triangleRadioButton.isSelected()) 
            {
                label1.setText("Base:");
                label2.setText("Altura:");
                textField1.setText("0");
                textField2.setText("0");
                textField3.setText("");
                textField1.setVisible(true);
                textField2.setVisible(true);
            } 
            else if (circleRadioButton.isSelected()) 
            {
                label1.setText("Radio:");
                label2.setText("");
                textField1.setText("0");
                textField2.setText("0");
                textField3.setText("");
                textField2.setVisible(false);
                textField1.setVisible(true);
            }
        }
    }

    public static void main(String[] args) 
    {
        new GeometricCalculatorGUI();
    }
}