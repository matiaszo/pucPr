package Poo;

class Light 
{
    boolean status = false;

    public void turn_on()
    {
        this.status = !this.status;
    }
}