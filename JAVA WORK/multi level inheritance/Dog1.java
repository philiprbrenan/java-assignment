public class Dog1 extends Mammals2{
  public void walk(){
    System.out.println("Animals can walk");
  }

  public static void main(String [] args){
    final Dog1 d = new Dog1();

    d.walk();
    d.procreate();
    d.eat();
  }
}   
