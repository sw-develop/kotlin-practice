package lec10;

public class JavaCat extends JavaAnimal {

  public JavaCat(String species, int legCount) {
    super(species, legCount);
  }

  @Override
  public void move() {
    System.out.println("야옹");
  }
}
