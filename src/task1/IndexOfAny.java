package task1;

public class IndexOfAny {
  /**
   * Write covering tests + refactor code.
   * In this task signature should stay the same
   */
  public static int indexOfAny(String str, char[] searchChars) {
    if (str.isEmpty() || searchChars.length <= 0) {
      return -1;
    }

    for(int i = 0; i < str.length(); ++i) {
      char ch = str.charAt(i);

      for(int j = 0; j < searchChars.length; ++j) {
        if (searchChars[j] != ch) {
          continue;
        }

        if (i >= str.length() - 1 || j >= searchChars.length - 1) {
          return i;
        }

        if (searchChars[j + 1] == str.charAt(i + 1)) {
          return i;
        }
      }
    }

    return -1;
  }
}
