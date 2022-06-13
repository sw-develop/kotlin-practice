package lec08;

public class Lec08Main {

  public static void main(String[] args) {
  }

  public int max(int a, int b) {
    if (a > b) {
      return a;
    }
    return b;
  }

  public void repeat(String str, int num, boolean useNewLine) {
    for (int i = 1; i <= num; i++) {
      if (useNewLine) {
        System.out.println(str);
      } else {
        System.out.println(str);
      }
    }
  }

  public void repeat(String str, int num) { //메서드 오버로딩
    repeat(str, num, true);
  }

  public void repeat(String str) { //메서드 오버로딩
    repeat(str, 3, true);
  }

  public static void printAll(String... strs) { //가변인자
    for (String str : strs) {
      System.out.println(str);
    }
  }
}
