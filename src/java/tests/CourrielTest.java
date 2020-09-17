/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Courriel;
/**
 *
 * @author sio2
 */
public class CourrielTest {
    
    public static void main(String[] args) {
        
        Courriel unCourriel = new Courriel(1,"10/09/20","Compensation","Bonjour voici la compensation");
        System.out.println(unCourriel.toString());
        System.out.println(unCourriel.getId() + "  " + unCourriel.getDate() + " " + unCourriel.getObjet() + " " + unCourriel.getCorps());
    }
}
