public class Cuadrado extends FigurasGeometricas 
{
    //Atributos
    private double lado;
   
    //Constructores
    Cuadrado()
    {
        super();
        setLado(0);        
    }
    
    Cuadrado(double l)
    {
        super();
        setLado(l);
    }
    
    //Getters
    public double getLado()
    {
        return lado;
    }
    
    //Setters
    public void setLado(double l)
    {
        if(l > 0)
        {
            lado = l; 
            calcularPerimetro();
            calcularArea();
        } 
    }
      
    //Otros
    protected void calcularPerimetro()
    {
        setPerimetro(4 * lado);
    }
    
    protected void calcularArea()
    {
        setArea(lado * lado);
    }
    
    public String toString()
    {
        return "P = " + getPerimetro() + " A = " + getArea();
    }
    
}