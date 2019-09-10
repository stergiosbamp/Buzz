 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Random;

/**
 *  Η ΚΛΑΣΗ QuestionList αναφερεται και διαχειριζεται την δημιουργια ολων των ερωτησεων του παιχνιδιου.
 * Περιεχει ως πεδία  μια λιστα με ολες τις ερωτησεις που 
 * υπαρχουν στο παιχνιδι.
 * 
 * @author Μπαμπάκης Αστέριος - Τσιολάκη Ελένη
 * @version 1.0
 */
public class QuestionList {
    
    private ArrayList<Question> questions ;

    public QuestionList() {
        questions = new ArrayList<Question>();
    }

    /**
     * Μεθοδος που μου επιστρεφει ολες τις ερωτησεις της λιστας
     * @return ενα ArrayList τυπου Question που εχει ολες τις ερωτησεις
     */
    public ArrayList<Question> getQuestions() {
        return questions;
    }

    
    /**
     * Μεθοδος που προσθετει μια καινουρια ερωτηση στην λιστα ερωτησεων
     * @param q ενα αντικειμενο τυπου Question που εχει την καινουρια ερωτηση
     */
    public void addQuestion(Question q) {
        questions.add(q);
    }
    
    /** Μεθοδος που καλειται για να μου επιστρεψει ενα αντικειμενο
     * της κλασης Question, δηλαδη  την ερωτηση που
     * θα παιξει τυχαια ο παικτης, καθως και τις 4 απαντησεις της συγκεκριμενης 
     * ερωτησης, οι οποιες μεσω της συναρτησης answersInRandom εμφανιζονται καθε φορα με 
     * διαφορετικη σειρα. 
     * Η συναρτηση αυτη καλειται σε καθε γυρο του παιχνιδιου, για καθε απαντηση
     * που θα παιξει ο παικτης και με την συναρτηση
     * shuffle ανακατευει ολες τις ερωτησεις της λιστας στην οποια ειναι 
     * αποθηκευμενο ολο το αρχειο του παιχνιδιου. 
     * 
     * Αφου εχουν φορτωθει οι ερωτησεις και τα δεδομενα, δημιουργει ενα νεο ArrayList
     * στο οποιο με αναθεση βαζει τις ανακατεμενες πλεον ερωτησεις και με την Random
     * παιρνει μια απο αυτες.
     * 
     * 
     * Δημιουργει ενα νεο αντικειμενο της κλασης
     * Question η οποια συμβολιζει την ερωτηση που επιλεχθηκε
     * και με τις getters της κλασης Question για την τυχαια 
     * επιλεγμενη ερωτηση  παιρνει ολες τις της πληροφοριες, δλδ εκφωνηση,
     * κατηγορια ,σωστη απαντηση και στην συνεχεια καλει την συναρτηση answersInRandom.
     * Ετσι παιρνει  και με τυχαια σειρα τις 4 απαντησεις της και της αποθηκευει
     * σε ενα καινουριο ArrayList που δημιουργειται.
     * 
     * Στην συνεχεια κανει remove την συγκεκριμενη ερωτηση,ωστε να μην μπορει να εμφανιστει για 
     * δευτερη φορα στο ιδιο παιχνιδι.
     * 
     * Τελος γινεται ελεγχος αν η ερωτηση αυτη ειναι παιδι της κλασης Question με την instanceof.
     * Αν ναι τοτε εκχωρειται και το ονομα που δηλωνει την εικονα και γινεται return ενα αντικειμενο
     * της QuestionWithImage
     * 
     * Κανει return ενα καινουριο αντικειμενο της κλασης Question ή της QuestionWithImage(που ειναι 
     * παιδι της Question) με παραμετρους οσα
     * αναφερθηκαν πιο πανω.
     * 
     * @return new Question/new QuestionWithImage, ενα αντικειμενο  
     * της κλασης Question ή της κλασης παιδι QuestionWithImage
     * 
     * 
     */
    public Question getAQuestionInRandom() {
        Collections.shuffle(questions);
        ArrayList<Question> questionsTemp = new ArrayList<>();
        questionsTemp = questions;
        Random r1 = new Random();
        int i1;

        //Diladi an uparxoun akoma erwtiseis
        if (questionsTemp.size() > 0) {

            i1 = r1.nextInt(questionsTemp.size());

            Question aRandomQuestion = questionsTemp.get(i1);
            String theName = aRandomQuestion.getQuestionName();
            String theCategory= aRandomQuestion.getCategory(); 
            String theRightAnswer = aRandomQuestion.getRightAnswer();
            ArrayList<String> theAnswers = new ArrayList<>();
             //EXW TIS ANAKATAMENES APANTHSEIS THS
            aRandomQuestion.answersInRandom();
            theAnswers=aRandomQuestion.getAnswers();
            questionsTemp.remove(aRandomQuestion);
            if(aRandomQuestion instanceof QuestionWithImage){
                String image= aRandomQuestion.getImage();
                return new QuestionWithImage(theName ,theCategory, theAnswers, theRightAnswer,image);
            }
          
        return new Question(theName ,theCategory, theAnswers, theRightAnswer );

        } else {
            
            String theName = "Ουπς!Οι ερωτήσεις τελείωσαν...Δώσε σαν απάντηση 0 για να συνεχίσεις το παιχνίδι σου";
            ArrayList<String> theAnswers = new ArrayList<>();
            //theAnswers= null;
            String theRightAnswer="";
            String theCategory="Ουπς!Οι ερωτήσεις αυτής της κατηγορίας τελείωσαν...Δώσε σαν απάντηση 0 για να συνεχίσεις το παιχνίδι σου";
            return new Question(theName , theCategory ,theRightAnswer );
            
        }
        
            
        }
}
