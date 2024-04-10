public class Rectangulo extends FigurasGeometricas
{
    //Atributos
    private double base;
    private double altura;
    
    Rectangulo()
    {
        setBase(0);
        setAltura(0);
    }
    
    Rectangulo(double b, double h)
    {
        setBase(b);
        setAltura(h);
    }
    
    //Getters
    public double getBase()
    {
        return base;
    }
    
    public double getAltura()
    {
        return altura;
    }
    
    //Setter
    public void setBase(double b)
    {
        if (b > 0)
            base = b;
        
        if(getBase() > 0 && getAltura() > 0)
        {
            calcularPerimetro();
            calcularArea();
        }
    }
    
    public void setAltura(double h)
    {
        if(h > 0)
            altura = h;
        
        if(getBase() > 0 && getAltura() > 0)
        {
            calcularPerimetro();
            calcularArea();
        }
    }
    
    //Otros
    private void calcularPerimetro()
    {
        setPerimetro((2*getBase())+(2*getAltura()));
    }
    
    private void calcularArea()
    {
        setArea(getBase()*getAltura());
    }
    
    public String toString()
    {
        return "P = " + getPerimetro() + " A = " + getArea();
    }
}
