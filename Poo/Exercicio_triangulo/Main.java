package Poo.Exercicio_triangulo;

public class Main 
{
    public static void main(String[] args) 
    {
        Triangle triangle = new Triangle(3, 3, 3);
        Triangle triangle2 = new Triangle(5, 6, 2);

        System.out.println(triangle.area());
        System.out.println(triangle2.area());
    }
}
