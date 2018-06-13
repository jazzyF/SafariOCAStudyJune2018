package lambdas;

public class Student {
  private String name;
  private float grade;

  public Student(String name, float grade) {
    this.name = name;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public float getGrade() {
    return grade;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", grade=" + grade +
        '}';
  }
}
