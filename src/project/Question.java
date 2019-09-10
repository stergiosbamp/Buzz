/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Η ΚΛΑΣΗ Question αναφερεται και διαχειριζεται την δημιουργια των ερωτησεων
 * του παιχνιδιου. Περιεχει ως πεδία την εκφωνηση της ερώτησης, την κατηγορια
 * της, μια λίστα από τις πιθανες σωστες απαντήσεις για την συγκεκριμένη
 * ερωτηση, καθώς και την σωστή απάντηση.
 *
 * @author Μπαμπάκης Αστέριος - Τσιολάκη Ελένη
 * @version 1.0
 */
public class Question {

    private String questionName;
    private String category;
    private ArrayList<String> answers = new ArrayList<>();
    private String rightAnswer;

    /**
     * @param q απο την q περνιεται στον κατασκευαστη της Question η εκφωνηση
     * της ερωτησης
     * @param c απο την c περνιεται στον κατασκευαστη της Question η κατηγορια
     * της ερωτησης
     * @param rA απο την rA περνιεται στον κατασκευαστη της Question η σωστη
     * απαντηση
     */
    public Question(String q, String c, String rA) {
        questionName = q;
        category = c;
        rightAnswer = rA;
    }

    /**
     * Κατασκευαστης της Question ο οποιος θα καλεστει μεσα στην κλαση
     * QuestionList
     *
     * @param q απο την q περνιεται στον κατασκευαστη της Question η εκφωνηση
     * της ερωτησης
     * @param c απο την c περνιεται στον κατασκευαστη της Question η κατηγορια
     * της ερωτησης
     * @param an απο την an περνιεται στον κατασκευαστη της Question ενα
     * ArrayList με τις 4 πιθανες απαντησεις
     * @param rA απο την rA περνιεται στον κατασκευαστη της Question η σωστη
     * απαντηση
     */
    public Question(String q, String c, ArrayList an, String rA) {
        questionName = q;
        category = c;
        rightAnswer = rA;
        answers = an;
    }

    /**
     * Κενος κατασκευαστης της Question ο οποιος θα καλεστει μεσα στην κλαση
     * BuzzWorld
     */
    public Question() {
        questionName = "";
        category = "";
        rightAnswer = "";
        answers = new ArrayList<String>();

    }

    /**
     * Συναρτηση που μου επιστρεφει την εκφωνηση της ερωτησης
     *
     * @return questionName ενα String που εχει την εκφωνηση
     */
    public String getQuestionName() {
        return questionName;
    }

    /**
     * Συναρτηση που μου επιστρεφει την σωστη απαντηση της συγκεκριμενης
     * ερωτησης
     *
     * @return rightAnswer ενα String που εχει την σωστη απαντηση
     */
    public String getRightAnswer() {
        return rightAnswer;
    }

    /**
     * Συναρτηση που μου επιστρεφει την κατηγορια της συγκεκριμενης ερωτησης
     *
     * @return category ενα String που εχει την κατηγορια
     */
    public String getCategory() {
        return category;
    }

    /**
     * Συναρτηση που με την βοηθεια της shuffle, "ανακατεύει" τις απαντησεις της
     * ερωτησης, δλδ στην ουσια αλλαζει την σειρα τους μεσα στο ArrayList
     *
     */
    public void answersInRandom() {
        Collections.shuffle(answers);
    }

    /**
     * Συναρτηση που μου επιστρεφει τις 4 πιθανες απαντησεις της συγκεκριμενης
     * ερωτησης
     *
     * @return ενα ArrayList με τις 4 απαντησεις που εμφανιζονται στον παικτη
     */
    public ArrayList<String> getAnswers() {
        return answers;
    }

    /**
     * συναρτηση που καλειται για να προσθεσει τις 4 απαντησεις που εμφανιζονται
     * στον παικτη για την συγκεκριμενη ερωτηση. Αυτη η συναρτηση θα καλεστει 4
     * φορες, μια για καθε απαντηση.
     *
     * @param answer περναει στην addAnswer με ενα String την νεα απαντηση που
     * θελω να δωσω στην ερωτηση
     */
    public void addAnswer(String answer) {
        answers.add(answer);
    }

    public String getImage() {
        return "";
    }
    
    /**
     * μεθοδος που διασχιζει ολο το ArrayList με τις απαντησεις και οποια ειναι η σωστη απαντηση κραταει
     * το νουμερο που εμφανιστηκε.
     * @return το νουμερο που εμφανιστηκε η σωστη απαντηση.
     */
    public int keepTheRightAnswer() {
        int rA = -7;
        int number = 1;
        for (String answer : getAnswers()) {
            if (answer.equals(getRightAnswer())) {
                rA = number;
            }
            number = number + 1;
        }
        return rA;
    }
}
