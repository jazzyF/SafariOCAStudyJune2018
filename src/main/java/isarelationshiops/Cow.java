package isarelationshiops;

public class Cow extends Animal {
  @Override
  public void eat() {
    System.out.println("moo, bite grass, chew cud...");
  }

  @Override
  public String foodPreference() {
    return "Grass";
  }
}
