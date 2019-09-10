/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;

/**
 *  Η ΚΛΑΣΗ RoundRightChoice ΑΝΑΦΕΡΕΤΑΙ ΣΤΟΝ ΓΥΡΟ ΣΩΣΤΗ ΑΠΑΝΤΗΣΗ ΚΑΙ ΚΛΗΡΟΝΟΜΕΙ 
 * ΑΠΟ ΤΗΝ ΜΗΤΡΙΚΗ ΚΛΑΣΗ Round. 
 *
 * @
 * @version 1.0
 */
public class RoundRightChoice extends Round {
    /**
     * Ο ΚΑΤΑΣΚΕΥΑΣΤΗΣ ΤΗΣ ΚΛΑΣΗΣ ΑΥΤΗΣ
     * ΚΑΛΕΙ ΤΟΝ ΚΑΤΑΣΚΕΥΑΣΤΗ ΤΗΣ Round.
     * @param n δηλωνει το ονομα του αρχειου δεδομενων που θα φορτωθει και περνιεται
     * ως παραμετρος στον κατασκευαση της Round με την super.
     * @throws java.io.IOException
     */
     
    public RoundRightChoice(String n) throws IOException {
        super(n);
    }
    /**
     * Η μέθοδος αυτή υλοποιεί το γύρο Σωστή Απάντηση.
     * 
     *Καλει την super.play δλδ την μεθοδο play της μητρικης κλασης Round.(αναλυεται στην κλαση Round)
     * 
     * @return q επιστρεφω το αντικειμενο Question που επιστρεφει η play της Round.
     * 
     */
    public Question playRoundRightChoice() {
       return super.play();
    }
    
    
}
