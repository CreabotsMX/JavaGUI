public class TrianguloRectangulo extends Triangulo 
{
    //Constructor
    public TrianguloRectangulo(double b, double h) 
    {
        super(b, h, Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2)));
    }
}