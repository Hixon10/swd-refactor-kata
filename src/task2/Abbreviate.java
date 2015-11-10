package task2;

public class Abbreviate {

  public static String abbreviate(String str, int offset) {
    return abbreviate(str, offset, str.length());
  }

  /**
   * Write covering tests + refactor code.
   * In this task you can simplify the signature. All usages in project are listed in Usages.java
   */
  public static String abbreviate(String str, int offset, int maxWidth) {
    if (str == null || str.length() <= maxWidth) {
      return str;
    }

    if(maxWidth < 4) {
      throw new IllegalArgumentException("Minimum abbreviation width is 4");
    }

    if(str.length() - offset < maxWidth - 3) {
      offset = str.length() - (maxWidth - 3);
    }

    if(offset <= 4) {
      return str.substring(0, maxWidth - 3) + "...";
    }

    if(maxWidth < 7) {
      throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
    }

    return offset + (maxWidth - 3) < str.length()?"..." + abbreviate(str.substring(offset), 0, maxWidth - 3):"..." + str.substring(str.length() - (maxWidth - 3));
  }
}
