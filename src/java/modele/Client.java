/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author Zakina
 */
public class Client {
    
    private int id;
    private String nom;
    private String prenom ;
    private String rue;
    private String copos ;
    private String ville;
    private String Mail;
    private Pays unPays ;
    private ArrayList<CategVente> lesCategVentes ;

    public Client() {
    }

    public Client(int id, String nom, String prenom,String rue,String copos,String ville,String Mail) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.copos = copos;
        this.ville = ville;
        this.Mail = Mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCopos() {
        return copos;
    }

    public void setCopos(String copos) {
        this.copos = copos;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Pays getUnPays() {
        return unPays;
    }

    public void setUnPays(Pays unPays) {
        this.unPays = unPays;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }
    
   
    public ArrayList<CategVente> getLesCategVentes() {
        return lesCategVentes;
    }

    public void setLesCategVentes(ArrayList<CategVente> lesCategVentes) {
        this.lesCategVentes = lesCategVentes;
    }
          
    public void addUneCategVente(CategVente uneCategVente){
        if (lesCategVentes == null){
            lesCategVentes = new ArrayList<CategVente>();
        }
        lesCategVentes.add(uneCategVente);
    }
}
