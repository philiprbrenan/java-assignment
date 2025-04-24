public class Reptile1 extends Animal3 {

  public void Scale(){
    System.out.println("Reptiles have scales");
  }

  public static void main(String[] args) {
    Reptile1 r = new Reptile1();
    r.Scale();
    r.eat();

    Mammals3 m = new Mammals3();
    m.procreate();
    m.eat();
  }
}     // hierachical inheritance