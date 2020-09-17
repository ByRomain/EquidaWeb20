/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Cheval;
/**
 *
 * @author sio2
 */
public class ChevalTest {
    
    public static void main(String[] args) {
        
        Cheval unCheval = new Cheval(1,"VROOM VROOM","no genda",8000,5657);
        System.out.println(unCheval.toString());
        System.out.println(unCheval.getId() + "  " + unCheval.getNom()+ " "+ unCheval.getSexe()+ " " + unCheval.getPrixDepart()+ " " + unCheval.getSire());
    }
}
