/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *  Η κλαση αυτη χρησιμοποιειται για την αρχικοποιηση των γυρων και της γλωσσας του παιχνιδιου
 * καθως και για την "αναπαραγωγη" των ερωτησεων αναλογα τον γυρο
 * 
 * @author Μπαμπάκης Αστέριος - Τσιολάκη Ελένη
 * @version 1.0
 */
public class GamePlay {

    private Round round;
    private RoundRightChoice roundR;
    protected RoundBet roundB;
    protected RoundStopwatch roundSw;
    protected RoundQuickAnswer roundQa;
    protected RoundThermometer roundTh;
    private ResourceBundle bundle;
    private Locale l;
    private Question q = new Question();
    
    /**
     * Ο κατασκευαστης της GamePlay αρχικοποιει τους γυρους του παιχνιδιου οι οποιοι δεχονται παραμετρους
     * για την αναγνωση των αρχειων δεδομενων, και την δημιουργια των Locale και bundle για την διεθνοποιηση του παιχνιδιου.
     * @param n ενα String που ειναι ειτε dataGr.txt ειτε dataEn.txt ετσι ωστε να γινει η φορτωση
     * του καταλληλου αρχειου δεδομενων αναλογα με την επιλογη του χρηστη.
     * @param language ενα String που ελεγχεται ετσι ωστε να δημιουργηθει το σωστο Locale αναλογα την επιλογη του χρηστη
     * στο παιχνιδι και κατ'επεκταση του bundle για την διεθνοποιηση, ετσι ωστε να μπορει να παιζει ειτε στα Ελληνικά
     * ειτε στα Αγγλικά.
     * @throws IOException 
     */
    public GamePlay(String n, String language) throws IOException {
        round = new Round(n);
        roundB = new RoundBet(n);
        roundR = new RoundRightChoice(n);
        roundSw = new RoundStopwatch(n);
        roundQa = new RoundQuickAnswer(n);
        roundTh = new RoundThermometer(n);
        if (language.equalsIgnoreCase("english")) {
            l = new Locale("en", "UK");
            bundle = ResourceBundle.getBundle("project.english", l);

        } else if (language.equalsIgnoreCase("greek")) {
            l = new Locale("gr", "GR");
            bundle = ResourceBundle.getBundle("project.greek", l);

        }
    }
    /**
     * Η μεθοδος αυτη "φορτωνει" τις καταλληλες ερωτησεις αναλογα τον γυρο τον οποιο παιζει ο παικτης
     * @param flag ενα προσδιοριστικό ώστε να ξερουμε καθε φορα τι ειδους γυρο παιζει ο παικτης μεχρι να ολοκληρωσει 
     * 5 ερωτησεις.Αν το flag ειναι 0 τοτε στην μεταβλητη q μπαινει μια ερωτηση του γυρου Σωστη Απαντηση 
     * αν ειναι 1 του γυρου Πονταρισματος, αν ειναι 2 του γυρου Σταματησε το Χρονομετρο, αν ειναι 3
     * του γυρου Γρηγορη Απαντηση και αν ειναι 4 του γυρου Θερμομετρο. Σε καθε περιπτωση με getters kai setters
     * ενημερωνονται οι υπολοιποι γυροι ετσι ωστε στο ιδιο παιχνιδι να μην του εμφανισει ερωτηση που εχει παιξει
     * προηγουμενως.
     * @return την ερωτηση του εκαστοτε γυρου
     * @throws IOException 
     */
    public Question getAQuestionFromARound(int flag) throws IOException {

        switch (flag) {
            case 0:
                q = roundR.playRoundRightChoice();
                roundB.setQL(roundR.getQL());
                roundSw.setQL(roundR.getQL());
                roundQa.setQL(roundR.getQL());
                roundTh.setQL(roundR.getQL());
                break;
            case 1:
                q = roundB.playRoundBet();
                roundR.setQL(roundB.getQL());
                roundSw.setQL(roundB.getQL());
                roundQa.setQL(roundB.getQL());
                roundTh.setQL(roundB.getQL());
                break;
            case 2:
                q = roundSw.playRoundStopwatch();
                roundR.setQL(roundSw.getQL());
                roundB.setQL(roundSw.getQL());
                roundQa.setQL(roundSw.getQL());
                roundTh.setQL(roundSw.getQL());
                break;
            case 3:
                q = roundQa.playRoundQuickAnswer();
                roundR.setQL(roundQa.getQL());
                roundB.setQL(roundQa.getQL());
                roundSw.setQL(roundQa.getQL());
                roundTh.setQL(roundQa.getQL());
                break;
            case 4:
                q = roundTh.playRoundThermometer();
                roundR.setQL(roundTh.getQL());
                roundB.setQL(roundTh.getQL());
                roundSw.setQL(roundTh.getQL());
                roundQa.setQL(roundTh.getQL());
                break;
            default:
                break;
        }

        return q;
    }
    
    /**
     * Getter για το bundle
     * @return το bundle στο Interface για να εμφανιζουμε τα σωστα μηνυματα στην σωστη γλωσσα.
     */
    public ResourceBundle getBundle() {
        return bundle;
    }

}
