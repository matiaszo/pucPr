package Poo;

public class Main 
{
    public static void main(String[] args)
    {
        Light light = new Light();
        light.turn_on();

        System.out.println(light.status);
    }
}
