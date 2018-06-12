package isarelationshiops;

public class Lion extends Animal {
  @Override
  public void eat() {
    System.out.println("roar, kill something, eat. Sleep...");
  }

  @Override
  public String foodPreference() {
    return "Fresh dead meat!";
  }
}
