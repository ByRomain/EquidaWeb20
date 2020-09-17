/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Vente;

/**
 *
 * @author sio2
 */
public class VenteTest {
    
    public static void main(String[] args) {
        
        Vente uneVente = new Vente(1,"Chez Maurice","06/08/20");
        System.out.println(uneVente.toString());
        System.out.println(uneVente.getId() + "  " + uneVente.getNom()+ " "+ uneVente.getDateDebutVente());
    }
}
