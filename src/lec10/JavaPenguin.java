package lec10;

public class JavaPenguin extends JavaAnimal implements JavaFlyable, JavaSwimmable {

  private final int wingCount;

  public JavaPenguin(String species) {
    super(species, 2);
    this.wingCount = 2;
  }

  @Override
  public void move() {
    System.out.println("펭귄 무빙");
  }

  @Override
  public int getLegCount() {
    return super.legCount + this.wingCount;
  }

  @Override
  public void act() {
    JavaFlyable.super.act();
    JavaSwimmable.super.act();
  }
}
