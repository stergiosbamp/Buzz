/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Public
 */
public class QuestionTest {
    private Question question;
    public QuestionTest() {
        question = new Question();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Δημιουργω ενα String και το περναω στα answers καλωντας την addAnswer().
     * Διατρεχωντας τo answers, αν βρεθει αυτο το String στην isFound μπαινει true.
     */
    @Test
    public void testAddAnswer() {
        System.out.println("addAnswer");
        String answer = "test";
        boolean isFound = false;
        question.addAnswer(answer);
        
        if (question.getAnswers().contains(answer)){
            isFound = true;
        }
        boolean expResult = true;
        
        assertEquals(expResult,isFound);
    }
    
}
