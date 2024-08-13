package Poo.Exercicio_triangulo;

public class Triangle 
{
    private double a, b, c;

    public Triangle(double a, double b, double c)
    {
        set_sides(a, b, c);
    }

    public double get_a(double a) {return this.a;}
    public double get_b(double b) {return this.b;}
    public double get_c(double c) {return this.c;}


    private void set_sides(double a, double b, double c)
    {
        if (!are_positive(a, b, c)) 
        {
            System.out.println("All the values's sides need's to be greater than 0!");
            System.exit(1);
        }
        if (!are_valid(a, b, c)) 
        {
            System.out.println("Your values can't make a triangle!!");
            System.exit(1);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean are_positive(double a, double b, double c)
    {
        if ((a > 0) && (b > 0) && (c > 0))
            return true;
        return false;
    }

    private boolean are_valid(double a, double b, double c)
    {
        if ((a + b) > c && (a + c) > b && (b + c) > a) 
            return true;
        return false;
        
    }

    public double perimeter() {return (this.a + this.b + this.c);}

    public double area()
    {
        double perimeter = this.perimeter() / 2;

        double area = Math.sqrt((perimeter * (perimeter - this.a)) * ((perimeter - this.b)) * ((perimeter - this.c)));

        return area;
    }
}
