/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Pays;

/**
 *
 * @author sio2
 */
public class PaysTest {
    
   public static void main(String[] args) {
        
        Pays unPays = new Pays("1", "dupont");   
        System.out.println(unPays.toString());
        System.out.println(unPays.getCode() + "  " + unPays.getNom());
        
        
    }
}
