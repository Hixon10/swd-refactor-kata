package task3;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class GameTest {
    @Test
    public void testCorrectAnswer() throws Exception {
        Game game = new Game();
        Question q = new Question("What is the Capital of Great Britain?", "Paris", "Karaganda", "Dublin", "London");
        game.addQuestion("What is the Capital of Great Britain?", "Paris", "Karaganda", "Dublin", "London", "London");
        assertTrue(game.checkAnswer(q, 1));
    }

    @Test
    public void testNotCorrectAnswer() throws Exception {
        Game game = new Game();
        Question q = new Question("What is the Capital of Great Britain?", "Paris", "Karaganda", "Dublin", "London");
        game.addQuestion("What is the Capital of Great Britain?", "Paris", "Karaganda", "Dublin", "London", "London");
        assertFalse(game.checkAnswer(q, 2));
    }

    @Test
    public void testAddQuestion() throws Exception {
        Game game = new Game();
        Question q = new Question("What is the Capital of Great Britain?", "Paris", "Karaganda", "Dublin", "London");
        game.addQuestion("What is the Capital of Great Britain?", "Paris", "Karaganda", "Dublin", "London", "London");
        List<Question> questions = game.getAllQuestions();
        assertEquals(q, questions.get(0));
    }

    @Test
    public void testGetAllQuestions() throws Exception {
        Game game = new Game();
        Question q = new Question("What is the Capital of Great Britain?", "Paris", "Karaganda", "Dublin", "London");
        Question q2 = new Question("What is the Capital of Great Britain - 2?", "Paris", "Karaganda", "Dublin", "London");

        game.addQuestion("What is the Capital of Great Britain?", "Paris", "Karaganda", "Dublin", "London", "London");
        game.addQuestion("What is the Capital of Great Britain - 2?", "Paris", "Karaganda", "Dublin", "London", "London");

        List<Question> questions = game.getAllQuestions();

        assertTrue(questions.contains(q));
        assertTrue(questions.contains(q2));
    }
}
