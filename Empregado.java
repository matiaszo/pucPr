public class Empregado{
   private String name;
   private String cargo;
   private int age;
   
   public Empregado(String name, String cargo, int age)
   {
      setName(name);
      setCargo(cargo);
      setAge(age);
   }
   
   public String getName() {return this.name;}
   private void setName(String name) {this.name = name;}

   public String getCargo() {return this.cargo;}
   private void setCargo(String cargo) {this.cargo = cargo.toLowerCase();}

   public int getAge() {return this.age;}
   private void setAge(int age) {this.age = age;} 

}