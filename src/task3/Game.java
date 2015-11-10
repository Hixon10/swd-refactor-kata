package task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game implements Iterable<Question> {
  private List<Question> questions = new ArrayList<>();
  private List<String> answers = new ArrayList<>();

  public void addQuestion(String q, String answ1, String answ2, String answ3, String answ4, String correctAnsw) {
    questions.add(new Question(q, answ1, answ2, answ3, answ4));
    answers.add(correctAnsw);
  }

  public List<Question> getAllQuestions() {
    return new ArrayList<>(questions);
  }

  public boolean checkAnswer(Question q, Integer answerNumber) {
    String answer = "";

    if (answerNumber == 1) {
      answer = q.answ1;
    } else if (answerNumber == 2) {
      answer = q.answ2;
    } else if (answerNumber == 3) {
      answer = q.answ3;
    } else if (answerNumber == 4) {
      answer = q.answ4;
    }

    return answers.get(questions.indexOf(q)).equals(answer);
  }

  @Override
  public Iterator<Question> iterator() {
    return new MyIterator();
  }

  private class MyIterator implements Iterator<Question> {
    int count = 0;

    @Override
    public boolean hasNext() {
      return count < questions.size();
    }

    @Override
    public Question next() {
      Question question = questions.get(count++);
      return new Question(question.q, question.answ4, question.answ3, question.answ2, question.answ1);
    }
  }
}
