package task3;

public class Question {
  public final String q, answ1, answ2, answ3, answ4;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Question)) return false;

    Question question = (Question) o;

    if (q != null ? !q.equals(question.q) : question.q != null) return false;
    if (answ1 != null ? !answ1.equals(question.answ1) : question.answ1 != null) return false;
    if (answ2 != null ? !answ2.equals(question.answ2) : question.answ2 != null) return false;
    if (answ3 != null ? !answ3.equals(question.answ3) : question.answ3 != null) return false;
    return !(answ4 != null ? !answ4.equals(question.answ4) : question.answ4 != null);

  }

  @Override
  public int hashCode() {
    int result = q != null ? q.hashCode() : 0;
    result = 31 * result + (answ1 != null ? answ1.hashCode() : 0);
    result = 31 * result + (answ2 != null ? answ2.hashCode() : 0);
    result = 31 * result + (answ3 != null ? answ3.hashCode() : 0);
    result = 31 * result + (answ4 != null ? answ4.hashCode() : 0);
    return result;
  }

  public Question(String q, String answ4, String answ3, String answ2, String answ1) {
    this.q = q;
    this.answ4 = answ4;
    this.answ3 = answ3;
    this.answ2 = answ2;
    this.answ1 = answ1;
  }

  public String getAnswerByIndex(Integer index) {
    String answer = "";

    if (index == 1) {
      answer = answ1;
    } else if (index == 2) {
      answer = answ2;
    } else if (index == 3) {
      answer = answ3;
    } else if (index == 4) {
      answer = answ4;
    }

    return answer;
  }
}
