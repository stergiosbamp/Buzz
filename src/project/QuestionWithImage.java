/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

/**
 * Η κλαση αυτη αναφερεται στις ερωτησεις που περιεχουν και εικονα και
 * κληρονομει απο την μητερα κλαση Question. Εχει ενα πεδιο String image που
 * δηλωνει το ονομα της εικονας που θα φορτωθει οταν παιχτει η συγκεκριμενη
 * ερωτηση
 *
 * @author Μπαμπάκης Αστέριος - Τσιολάκη Ελένη
 * @version 1.0
 */
public class QuestionWithImage extends Question {

    private String image;

    /**
     * Κατασκευαστες που αρχικοποιουν αντικειμενα της QuestionWithImage και
     * κανουν χρηση της super
     */
    public QuestionWithImage(String q, String c, String rA, String i) {
        super(q, c, rA);
        image = i;
    }

    public QuestionWithImage() {
        super();
    }

    public QuestionWithImage(String theName, String theCategory, ArrayList<String> theAnswers, String theRightAnswer, String i) {
        super(theName, theCategory, theAnswers, theRightAnswer);
        image = i;
    }

    public String getImage() {
        return image;
    }

    public void addAnswer(String answer) {
        super.addAnswer(answer);
    }

}
