public class Empregado{
   private String name;
   private int age;
   private String cargo;
   
   public Empregado(String name, String cargo, int age)
   {
      setName(name);
   }
   
   void setName(String name) {this.name = name;}
   
   void print()
   {
      if (is_accepted_cargo())
   }
   
   boolean is_accepted_cargo()
   {
      if(this.cargo == "G" || this.cargo == "D" || this.cargo == "A")
         return true;
      return false;
   }
}