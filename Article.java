/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac3;

/**
 *
 * @author xuyao
 */
public class Article {
    private String id;
    private String nom;
    private float preu;
    private boolean admetUrgent;
    private int temps;

    public Article(String id, String nom, float preu, boolean admetUrgent, int temps) {
        this.id = id;
        this.nom = nom;
        this.preu = preu;
        this.admetUrgent = admetUrgent;
        this.temps = temps;
    }
    
    
    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public float getPreu() {
        return preu;
    }

    public boolean isAdmetUrgent() {
        return admetUrgent;
    }

    public int getTemps() {
        return temps;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public void setAdmetUrgent(boolean admetUrgent) {
        this.admetUrgent = admetUrgent;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", nom=" + nom + ", preu=" + preu + ", admetUrgent=" + admetUrgent + ", temps=" + temps + '}';
    }
    
    
    
}
