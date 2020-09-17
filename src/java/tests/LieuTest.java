/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Lieu;
/**
 *
 * @author sio2
 */
public class LieuTest {
    
    public static void main(String[] args) {
        
        Lieu unLieu = new Lieu(1," une ville ",7," oui ");
        System.out.println(unLieu.toString());
        System.out.println(unLieu.getId() + "  " + unLieu.getVille() + " " + unLieu.getNbBoxes() + " " + unLieu.getCommentaires());
    }
}
