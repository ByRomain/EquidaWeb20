/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.CategVente;
/**
 *
 * @author sio2
 */
public class CategVenteTest {
    
    public static void main(String[] args) {
        
        CategVente uneCategVente = new CategVente("5478"," une vente ");
        System.out.println(uneCategVente.toString());
        System.out.println(uneCategVente.getCode() + "  " + uneCategVente.getLibelle());
    }
}
