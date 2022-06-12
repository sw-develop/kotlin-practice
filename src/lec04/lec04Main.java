package lec04;

public class lec04Main {

  public static void main(String[] args) {
    JavaMoney m1 = new JavaMoney(2_000L);
    JavaMoney m2 = new JavaMoney(1_000L);
    JavaMoney m3 = m1;
    JavaMoney m4 = new JavaMoney(2_000L);

    if (m1.compareTo(m2) > 0) {
      System.out.println("m1이 m2보다 금액이 큽니다");
    }

    //동등성, 동일성 비교
    System.out.println(m1 == m3); //true
    System.out.println(m1 == m4); //false
    System.out.println(m1.equals(m4)); //true
  }
}
