package task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game implements Iterable<Question> {
  private List<Question> questions = new ArrayList<>();
  private List<String> answers = new ArrayList<>();

  public void addQuestion(Question q, String correctAnsw) {
    questions.add(q);
    answers.add(correctAnsw);
  }

  public List<Question> getAllQuestions() {
    return new ArrayList<>(questions);
  }

  public boolean checkAnswer(Question q, Integer answerNumber) {
    String answer = q.getAnswerByIndex(answerNumber);
    return answers.get(questions.indexOf(q)).equals(answer);
  }

  @Override
  public Iterator<Question> iterator() {
    return new Iterator<Question>() {
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
    };
  }
}
