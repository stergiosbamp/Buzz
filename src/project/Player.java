/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**Η κλάση Player που αναφερεται στον παικτη που θα παιζει το ατομικο & το ανταγωνιστικο παιχνιδι.
 *
 * @author Μπαμπάκης Αστέριος - Τσιολάκη Ελένη
 * version 1.0
 */
public class Player {

    /**
     * το πεδιο αυτης της κλασης εινα οι ποντοι που θα συγκεντρωσει ο παικτης
     */
    private int points;
    
    
    /**δημιουργειται ενας καινουριος παικτης με τον constructor.
     *
     * @param p ειναι οι ποντοι με τους οποιους ξεκιναει ο παικτης στο παιχνιδι. 
     * 
     * 
     */
    public Player(int p) {
        points = p;
    }
    
    
    
    /**συναρτηση που ανανεωνει τους ποντους του παικτη. Συγκεκριμενα αφαιρει απο τους
     * ποντους του παικτη αυτους που εχασε στην συγκεκριμενη ερωτηση
     * 
     * @param p οι ποντοι που εχασε ο παικτης
     */
    public void lose(int p) {
        points = points - p;
    }
    
    /**συναρτηση που ανανεωνει τους ποντους του παικτη. Συγκεκριμενα προσθετει στους
     * ποντους του παικτη αυτους που κερδισε στην συγκεκριμενη ερωτηση
     * 
     * @param p οι ποντοι που κερδισε ο παικτης
     */
    public void win(int p) {
        points = points + p;
    }
    
    /**
     * συναρτηση που επιστρεφει τους ποντους που εχει ο παικτης.
     * @return το points που ειναι οι ποντοι του παικτη
     */
    public int getPoints(){
        return points;
    }
    
    
}