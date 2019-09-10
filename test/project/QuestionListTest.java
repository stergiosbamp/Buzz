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
public class QuestionListTest {
    
    public QuestionListTest() {
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
     * Δημιουργω ενα questionList & ενα Question και το περναω στo questionList καλωντας την addQuestion().
     * Διατρεχωντας τo questionList, αν βρεθει αυτο το Question που περασα ,στην isFound μπαινει true.
     */
    @Test
    public void testAddQuestion() {
        System.out.println("addQuestion");
        QuestionList qL = new QuestionList();
        Question q = new Question();
        qL.addQuestion(q);
        boolean isFound = false;
        if (qL.getQuestions().contains(q)){
            isFound =true;
        }
        boolean expResult = true;
        assertEquals(expResult, isFound );
    }

    /**
     * Λογω του Random ΔΕΝ γινεται ελεγχος & λογω του οτι την αφαιρει
     * πριν την επιστρεψει(για να μην ξαναεμφανιστει στο ιδιο παιχνιδι).
     * Αν η υλοποιηση της μεθοδου δεν την αφαιρουσε τοτε ο κωδικας θα ηταν ο παρακατω
     */
    @Test
    public void testGetAQuestionInRandom() {
        
        Question q = new Question();
        QuestionList qL = new QuestionList();
        qL.addQuestion(q);
        
        q=qL.getAQuestionInRandom();
        
        boolean isFound = false;
        
        if(qL.getQuestions().contains(q)){
            isFound = true;
        }
        boolean expResult = true;
        assertEquals(expResult,isFound);
    }
    
}
