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
public class Course {
    private int id;
    private String nom;
    private String date;
    private String lieu;
    private int place;

    public Course() {
    }

    public Course(int id, String nom, String date, String lieu, int place) {
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.lieu = lieu;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDate() {
        return date;
    }

    public String getLieu() {
        return lieu;
    }

    public int getPlace() {
        return place;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setPlace(int place) {
        this.place = place;
    }
    
    
}
