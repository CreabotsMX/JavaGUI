public class Triangulo extends Rectangulo 
{
    private double hipotenusa;
    
    //Constructores
    Triangulo()
    {
        setBase(0);
        setAltura(0);
        setHipotenusa();
    }
    
    Triangulo(double b, double h)
    {
        setBase(b);
        setAltura(h);
        setHipotenusa();
    }
    
    //Getters
    private double getHipotenusa()
    {
        return hipotenusa;
    }
    
    //Setters
    private void setHipotenusa()
    {
        if(getBase() > 0 &&  getAltura() > 0)
        {
            hipotenusa = Math.sqrt(Math.pow(getBase(),2) + Math.pow(getAltura(),2));   
        }
        
        else
        {
            hipotenusa = 0;
        }
        
        if(getBase() > 0 &&  getAltura() > 0 && getHipotenusa() > 0)
        {
            calcularPerimetro();
            calcularArea();
        }     
    }

    //Otros
    private void calcularPerimetro()
    {
        setPerimetro(getBase() + getAltura() + getHipotenusa());
    }

    private void calcularArea()
    {
        setArea(getBase() * getAltura() / 2);
    }

    public String toString()
    {
        return "Hipotenusa = " + getHipotenusa() + " P = " + getPerimetro() + " A = " + getArea(); 
    }
}
