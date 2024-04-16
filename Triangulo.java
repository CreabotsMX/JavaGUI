public class Triangulo extends FigurasGeometricas 
{
    private double lado1;
    private double lado2;
    private double lado3;
    
    //Constructores
    Triangulo()
    {
        super();
        setLado1(0);
        setLado2(0);
        setLado3(0);
    }
    
    Triangulo(double lado1, double lado2, double lado3)
    {
        super();
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }
    
    //Getters
    public double getLado1()
    {
        return lado1;
    }

    public double getLado2()
    {
        return lado2;
    }

    public double getLado3()
    {
        return lado3;
    }
    
    //Setters
    public void setLado1(double l1)
    {
        if(l1 > 0)
        {
            lado1 = l1;   
        }
        
        if(getLado1() > 0 &&  getLado2() > 0 && getLado3() > 0)
        {
            calcularPerimetro();
            calcularArea();
        }     
    }

    public void setLado2(double l2)
    {
        if(l2 > 0)
        {
            lado2 = l2;   
        }
        
        if(getLado1() > 0 &&  getLado2() > 0 && getLado3() > 0)
        {
            calcularPerimetro();
            calcularArea();
        }     
    }

    public void setLado3(double l3)
    {
        if(l3 > 0)
        {
            lado3 = l3;   
        }
        
        if(getLado1() > 0 &&  getLado2() > 0 && getLado3() > 0)
        {
            calcularPerimetro();
            calcularArea();
        }     
    }

    //Otros
    protected void calcularPerimetro()
    {
        setPerimetro(getLado1() + getLado2() + getLado3());
    }

    protected void calcularArea()
    {
        // Fórmula de Herón para calcular el área de un triángulo
        double s = getPerimetro() / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        setArea(area);
    }

    public String toString()
    {
        return " P = " + getPerimetro() + " A = " + getArea(); 
    }
}
