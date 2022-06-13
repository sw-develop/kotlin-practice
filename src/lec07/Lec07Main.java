package lec07;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

public class Lec07Main {

  public static void main(String[] args) throws IOException {
    JavaFilePrinter printer = new JavaFilePrinter();
    printer.readFile();
  }

  private int parseIntOrThrow(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(String.format("%s는 숫자가 아님", str));
    }
  }

  private Integer parseIntOrNull(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      return null;
    }
  }
}
