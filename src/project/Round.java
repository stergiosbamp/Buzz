/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Η κλάση Round είναι η μητρική κλάση απο την οποία κληρονομούν οι κλάσεις
 * RoundRightChoice,RoundBet,RoundQuickAnswe,RoundStopwatch,RoundThermometer.
 * Περιέχει ως πεδίo ενα αντικειμενο της κλασης
 * QuestionList, που αναπαριστα την λιστα με ολες τις ερωτησεις που υπαρχουν στο
 * παιχνιδι και επισης εναν BufferedReader για αναγνωση των αρχειων δεδομενων.
 *
 * @author Μπαμπάκης Αστέριος - Τσιολάκη Ελένη
 */
public class Round {

    protected QuestionList ql;
    private BufferedReader reader;

    /**
     * Αρχικοποιειται το QuestionList και στον BufferedReader δινεται το ονομα του αρχειου
     * που πρεπει να διαβασει.
     * Καλείται η σύναρτηση loadData() η οποία φορτώνει τα δεδομένα στο
     * παιχνίδι. Δηλ όλες τις ερωτήσεις και όλες τις απαντήσεις.
     * 
     * @param n ενα String που ειναι ειτε dataGr.txt είτε dataEn.txt και δηλωνει το ονομα του αρχειου
     * απο το οποιο θα διαβασει τα δεδομενα αναλογα την γλωσσα που θα επιλεξει να παιξει το παιχνιδι ο χρηστης.
     *
     */
    public Round(String n) throws FileNotFoundException, IOException {
        ql = new QuestionList();
        reader = new BufferedReader(new FileReader(n));
        loadData();
    }

    /**
     * Η συναρτηση get που επιστρεφει την λιστα με τις ερωτησεις
     *
     * @return ql
     *
     */
    public QuestionList getQL() {
        return ql;
    }

    /**
     * Η συναρτηση set που ανανεωνει το αντικειμενο της κλασης QuestionList
     *
     * @param q οπου q η ανανεωμενη λιστα
     */
    public void setQL(QuestionList q) {
        ql = q;
    }

    /**
     * Η μέθοδος αυτή υλοποιεί ολους τους γυρους και για αυτο κληρονομουν απο
     * την Round.
     *
     * Δημιουργειται ενα αντικειμενο της κλασης Question  
     * στο οποιο στην συνεχεια γινεται αναθεση του αντικειμενου
     * που επιστρεφει η μεθοδος getAQuestionInRandom(αναλύεται στην κλάση
     * QuestionList).
     *
     * @return q το αντικειμενο της Question για να το
     * εμφανισω.
     *
     */
    public Question play() {

        Question q = new Question();
        q = ql.getAQuestionInRandom();
        return q;
    }

    /**Για καθε γραμμη του αρχειου (το καθε στοιχειωδες κομματι ειναι χωρισμενο με - δηλαδη
     * η εκφωνηση,με τις απαντησεις, με την σωστη απαντηση , με το ονομα της εικονας αν εχει εικονα η ερωτηση
     * κτλπ ειναι ολα αυτα χωρισμενα με -) , χωριζονται τα στοιχεια της καθε ερωτησης με την σειρα σε κομματια
     * με την βοηθεια της split βαση του συμβολου - και τα στοιχεια αυτα μπαινουν σε εναν πινακα.
     * Επειδη ομως οι πινακες ξεκινανε την αριθμητη τους απο 0 για καθε κομματι
     * γινεται κομματι+1. Ετσι αν τα κομματια ειναι 7 τοτε σημαινει δεν υπαρχει εικονα και
     * με καταλληλες αναθεσεις φορτωνονται τα δεδομενα καθε ερωτησης. Αλλιως (επειδη στο τελος του αρχειου
     * εχουμε βαλει να υπαρχει αν υπαρχει το ονομα της εικονας!) στο τελευταιο κομματι ειναι το ονομα της εικονας οποτε
     * και γινεται αναθεση σε ενα String image.
     * 
     * Αφου λοιπον γινουν ολες οι αναθεσεις για ολες τις πληροφοριες καθε ερωτησης(εκφωνηση της ερωτησης, η κατηγορια στην
     * οποια ανηκει και η σωστή απάντηση & αν εχει εικονα ή οχι αναλογα)
     * καλουνται οι κατασκευαστες ειτε της Question ειτε της QuestionWithImage.
     * Τελος τα αντικειμενα περνιουνται στο questionList.
     * Η ολη διαδικασια επαναλαμβανεται μεχρι να διαβαστει ολο το αρχειο
     * 
     */
    public void loadData() throws IOException {
        String line;
        Question q;
        QuestionWithImage qi;
        String category;
        String rightAnswer;
        String qName;
        int numberOfParts;
        
        while ((line = reader.readLine()) != null) {
            numberOfParts = 0;
            String[] parts = line.split("-");
            qName = parts[0];
            category = parts[1];
            rightAnswer = parts[2];
            for (String p : parts) {
                numberOfParts = numberOfParts + 1;
            }

            if (numberOfParts == 7) {
                q = new Question(qName, category, rightAnswer);
                q.addAnswer(parts[3]);
                q.addAnswer(parts[4]);
                q.addAnswer(parts[5]);
                q.addAnswer(parts[6]);
                ql.addQuestion(q);
            } else {
                String image = parts[7];
                qi = new QuestionWithImage(qName, category, rightAnswer, image);
                qi.addAnswer(parts[3]);
                qi.addAnswer(parts[4]);
                qi.addAnswer(parts[5]);
                qi.addAnswer(parts[6]);
                ql.addQuestion(qi);
            }
        }
    }

}
