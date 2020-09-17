/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.TypeCheval;
/**
 *
 * @author sio2
 */
public class TypeChevalTest {
    
    public static void main(String[] args) {
        
        TypeCheval unTypeCheval = new TypeCheval(1,"A MOTEUR","VROOM");
        System.out.println(unTypeCheval.toString());
        System.out.println(unTypeCheval.getId() + "  " + unTypeCheval.getLibelle()+ " "+ unTypeCheval.getDescription());
    }
}
