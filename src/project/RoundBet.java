/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;

/**
 *  Η ΚΛΑΣΗ RoundBet ΑΝΑΦΕΡΕΤΑΙ ΣΤΟΝ ΓΥΡΟ ΠΟΝΤΑΡΙΣΜΑ ΚΑΙ ΚΛΗΡΟΝΟΜΕΙ 
 * ΑΠΟ ΤΗΝ ΜΗΤΡΙΚΗ ΚΛΑΣΗ Round. 
 *
 * @author Μπαμπάκης Αστέριος - Τσιολάκη Ελένη
 * @version 1.0
 */
public class RoundBet extends Round {
    
   
    /**
     * Ο ΚΑΤΑΣΚΕΥΑΣΤΗΣ ΤΗΣ ΚΛΑΣΗΣ ΑΥΤΗΣ
     * ΚΑΛΕΙ ΤΟΝ ΚΑΤΑΣΚΕΥΑΣΤΗ ΤΗΣ Round.
     * @param n δηλωνει το ονομα του αρχειου δεδομενων που θα φορτωθει και περνιεται
     * ως παραμετρος στον κατασκευαση της Round με την super.
     * @throws java.io.IOException
     */
    public RoundBet(String n) throws IOException {
        super(n);
    }
    /**
     * Η μέθοδος αυτή υλοποιεί το γύρο Πονταρισμα.
     * 
     * Καλει την super.play δλδ την μεθοδο play της μητρικης κλασης Round.(αναλυεται στην κλαση Round)
     * 
     * @return q επιστρεφω το αντικειμενο Question που επιστρεφει η play της Round.
     * 
     */
    public Question playRoundBet() {
        return super.play();
        
    }
   
}
