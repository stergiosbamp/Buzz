/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import java.util.*;

/**
 * Η κλάση Project δημιουργει ενα αντικειμενο της κλασης Gui η οποια
 * υλοποιει ολο το παιχνδι.
 *
 * @author Μπαμπάκης Αστέριος - Τσιολάκη Ελένη
 * @version 1.0
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    /**
     * Δημιουργια αντικειμενου Gui και διεξαγωγή του προγράμματος-παιχνιδιού.
     */
    public static void main(String[] args) throws IOException {
        Gui g = new Gui();
        g.setVisible(true);
    }

}
