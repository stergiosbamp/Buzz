/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**Η κλαση αυτη αναφερεται στην εγγραφη στα αρχεια.
 *
 * @
 * @version 1.0
 */

public class ScoreWriter {
    private int pointsForPlayer1;
    private int pointsForPlayer2;
    private PrintWriter writer ;
    
    
    /**
     * Constructor που χρησιμοποιειται για το ανταγωνιστικο παιχνιδι
     * @param p1 ποντοι του πρωτου παικτη
     * @param p2 ποντοι του δευτερου παικτη
     */
    public ScoreWriter(int p1,int p2){
        pointsForPlayer1=p1;
        pointsForPlayer2=p2;
    }
    /**
     * Constructor που χρησιμοποιειται για το ατομικο παιχνιδι
     * @param p1 ποντοι του  παικτη
    */
    public ScoreWriter(int p1){
        pointsForPlayer1 = p1;
    }
    /**
     * Μεθοδος για την εγγραφη των απαραιτητων δεδομενων για το ανταγωνιστικο παιχνιδι.
     * Γραφει στο αρχειο με ποσους ποντους τερματιζουν οι 2 παικτες και ποιος ειναι ο νικητης του παιχνιδιου
     * Ο τροπος που ανοιγει το αρχειο για εγγραφη ,επιτρεπει πολλαπλες εγγραφες για τα δεδομενα ενος
     * επομενου παιχνιδιου είτε ανταγωνιστικό είτε ατομικό.
     * @throws IOException 
     */
    public void writeScoreFor2() throws IOException{
       
        
        writer = new PrintWriter(new FileWriter("score.txt",true));
        writer.println("\n Double Game: \n");
        writer.println("Player1 has : " + pointsForPlayer1 + " points");
        writer.println("Player2 has : " + pointsForPlayer2 + " points");
        if(pointsForPlayer1>pointsForPlayer2){
            writer.println("Winner is Player1");
        }else{
            writer.println("Winner is Player2");
        }
        writer.println("After a new game...");
        writer.close();
    }
    
    /**
     * Μεθοδος για την εγγραφη των απαραιτητων δεδομενων για το ατομικο παιχνιδι.
     * Γραφει στο αρχειο με ποσους ποντους τερματιζει ο  παικτης .
     * Ο τροπος που ανοιγει το αρχειο για εγγραφη ,επιτρεπει πολλαπλες εγγραφες για τα δεδομενα ενος
     * επομενου παιχνιδιου είτε ανταγωνιστικό είτε ατομικό.
     * @throws IOException 
     */
    public void writeScoreFor1() throws IOException{
        writer = new PrintWriter(new FileWriter("score.txt",true));
        writer.println("\n Single Game: \n");
        writer.println("Player has : " + pointsForPlayer1 + " points.");
        writer.println("After a new game...");
        writer.close();
    }
}
