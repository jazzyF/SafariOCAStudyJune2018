package isarelationshiops;

public class AnimalSanctuary {
  public static void feed(Animal a) {
    System.out.println("feeding the animal some " + a.foodPreference());
    a.eat();
  }

/*
  public static void feed(Cow c) {
    System.out.println("feeding the cow...");
    c.eat();
  }

  public static void feed(Lion l) {
    System.out.println("feeding the lion...");
    l.eat();
  }

*/
  public static void main(String [] args) {
    Animal a = new Lion();
//    Cow c = new Cow();
    feed(a); // Animal a = l; Animal a = new Lion();
    a = new Cow();
    feed(a);
    a = new Hyena();
    feed(a);

    System.out.println("----------------");
    Animal[] theZoo = {
        new Lion(),
        new Cow(),
        new Hyena()
    };
    for (Animal animal : theZoo) {
      feed(animal);
    }
  }
}
