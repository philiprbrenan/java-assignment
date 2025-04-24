public class Mammal1 extends Animal1{

  public void procreate(){
    System.out.println("Mammals procreate");
  }

  public static void main (String[] args){
    Mammal1 a = new Mammal1();
    a.eat();
    a.procreate();
  }
}   // for single inheritance