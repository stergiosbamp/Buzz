/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

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
public class RoundTest {
    
    public RoundTest() {
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
     * Δεν γινεται ελεχγος γιατι καλειται η getAQuestionInRandom που περιεχει μεσα της Randοm
     * & κανει και remove(για να μην ξαναεμφανιστει η ιδια ερωτηση στο ιδιο παιχνιδι).
     * Αρα δεν μπορω να ελεγξω αν η ερωτηση που μου επιστρεφει υπηρχε πριν στο συνολο
     * γιατι τοτε στον ελεγχο (με την contains px) θα βγαζει παντα false.
     *  
     */
    @Test
    public void testPlay() {
        
    }

    
}
