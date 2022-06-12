package lec03;

import org.jetbrains.annotations.Nullable;

public class Person {

  private final String name;

  public Person(String name) {
    this.name = name;
  }

  @Nullable
  public String getName() {
    return this.name;
  }
}
