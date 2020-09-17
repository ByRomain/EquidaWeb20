/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author sio2
 */
public class Cheval {
    
    private int id;
    private String nom;
    private String sexe;
    private int prixDepart;
    private int sire;

    public Cheval() {
    }

    public Cheval(int id, String nom, String sexe, int prixDepart, int sire) {
        this.id = id;
        this.nom = nom;
        this.sexe = sexe;
        this.prixDepart = prixDepart;
        this.sire = sire;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getSexe() {
        return sexe;
    }

    public int getPrixDepart() {
        return prixDepart;
    }

    public int getSire() {
        return sire;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setPrixDepart(int prixDepart) {
        this.prixDepart = prixDepart;
    }

    public void setSire(int sire) {
        this.sire = sire;
    }
    
    
}
