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
public class PlayerTest {
    private Player player;
    public PlayerTest() {
        player = new Player(1000);
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
     * Στο τεστ της lose() στο expResult βαζω με το χερι τους ποντους που χανει(εστω 250)
     * και μετα καλωντας την lose() ελεγχω αν δουλεψε σωστα και βγαζει ιδιο αποτελεσμα
     * με το expResult
     */
    @Test
    public void testLose() {
        System.out.println("lose");
        int p = 250;
        int expResult = player.getPoints()-p;
        player.lose(p);
        assertEquals(expResult,player.getPoints(), 0.0);
        
        
    }

    /**
     * Στο τεστ της win() στο expResult βαζω με το χερι τους ποντους που κερδιζει(εστω 250)
     * και μετα καλωντας την win() ελεγχω αν δουλεψε σωστα και βγαζει ιδιο αποτελεσμα
     * με το expResult
     */
    @Test
    public void testWin() {
       System.out.println("win");
        int p = 250;
        int expResult = player.getPoints()+p;
        player.win(p);
        assertEquals(expResult,player.getPoints(), 0.0);
    }

    
    
}
