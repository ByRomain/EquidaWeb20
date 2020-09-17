/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
/**
 *
 * @author sio2
 */
public class Courriel {
    private int id;
    private String date;
    private String objet;
    private String corps;
    private ArrayList<Courriel> lesCourriels ;

    public Courriel() {
    }

    public Courriel(int id, String date, String objet, String corps) {
        this.id = id;
        this.date = date;
        this.objet = objet;
        this.corps = corps;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getObjet() {
        return objet;
    }

    public String getCorps() {
        return corps;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }
    
    public ArrayList<Courriel> getLesCourriels() {
        return lesCourriels;
    }

    public void setLesCourriels(ArrayList<Courriel> lesCourriels) {
        this.lesCourriels = lesCourriels;
    }
          
    public void addUnCourriel(Courriel unCourriel){
        if (lesCourriels == null){
            lesCourriels = new ArrayList<Courriel>();
        }
        lesCourriels.add(unCourriel);
    }
}
