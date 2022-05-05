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
public abstract class Client {
    private String tipus;
    private String email;
    private String nom;
    private String adreca;
    private float descompteEnv;
    private float mensualitat;

    public Client(String tipus, String email, String nom, String adreca, float descompteEnv, float mensualitat) {
        this.tipus = tipus;
        this.email = email;
        this.nom = nom;
        this.adreca = adreca;
        this.descompteEnv = descompteEnv;
        this.mensualitat = mensualitat;
    }
    


    public String getTipus() {
        return tipus;
    }

    public float getDescompteEnv() {
        return descompteEnv;
    }

    public float getMensualitat() {
        return mensualitat;
    }

    public String getEmail() {
        return email;
    }

    public String getNom() {
        return nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setDescompteEnv(float descompteEnv) {
        this.descompteEnv = descompteEnv;
    }

    public void setMensualitat(float mensualitat) {
        this.mensualitat = mensualitat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }
    
    public abstract String tipusClient();
    public abstract float calcMensual();
    public abstract float descompteEnv();

    @Override
    public String toString() {
        return "Client{" + "tipus=" + tipus + ", email=" + email + ", nom=" + nom + ", adreca=" + adreca + ", descompteEnv=" + descompteEnv + ", mensualitat=" + mensualitat + '}';
    }
    
    
}
