/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.PieceJointe;
/**
 *
 * @author sio2
 */
public class PieceJointeTest {
    
    public static void main(String[] args) {
        
        PieceJointe unePieceJointe = new PieceJointe(1," https://etc/www "," la piece ");
        System.out.println(unePieceJointe.toString());
        System.out.println(unePieceJointe.getId() + "  " + unePieceJointe.getChemin() + " " + unePieceJointe.getDescription());
    }
}
