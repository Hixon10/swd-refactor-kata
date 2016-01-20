package task2;

public class Abbreviate {

  /**
   * Write covering tests + refactor code.
   * In this task you can simplify the signature. All usages in project are listed in Usages.java
   */
  public static String abbreviate(String str, int offset, int maxWidth) {
    if (str == null) {
      return null;
    }

    if (maxWidth < 4) {
      throw new IllegalArgumentException("Minimum abbreviation width is 4");
    }

    if (str.length() <= maxWidth) {
      return str;
    }

    return str.substring(0, maxWidth - 3) + "...";
  }
}
