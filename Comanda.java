/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac3;
import java.util.Date;
/**
 *
 * @author xuyao
 */
public abstract class Comanda {
    private String tipus;
    private Client client;
    private Article article;
    private int quantitat;
    private Date data;
    private boolean enviat;
    private boolean rebuda;
    private float preuArt;
    private float preuEnv;

    public Comanda(String tipus,Client client, Article article,int quantitat, boolean enviat,boolean rebuda,int preuEnv) {
        this.tipus=tipus;
        this.client = client;
        this.article = article;
        this.quantitat = quantitat;
        this.data = new Date();
        this.enviat=enviat;
        this.rebuda=rebuda;
        this.preuArt=article.getPreu();
        this.preuEnv=preuEnv;
        
    }

    public String getTipus() {
        return tipus;
    }

    public boolean isEnviat() {
        return enviat;
    }

    public boolean isRebuda() {
        return rebuda;
    }
    

    public float getPreuArt() {
        return preuArt;
    }

    public float getPreuEnv() {
        return preuEnv;
    }
    

    public Client getClient() {
        return client;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public Date getData() {
        return data;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setEnviat(boolean enviat) {
        this.enviat = enviat;
    }

    public void setRebuda(boolean rebuda) {
        this.rebuda = rebuda;
    }

    public void setPreuArt(float preuArt) {
        this.preuArt = preuArt;
    }

    public void setPreuEnv(float preuEnv) {
        this.preuEnv = preuEnv;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public float calcPreu(){
        return article.getPreu()*this.quantitat;
    }
    
    public abstract String tipusComanda();
    public abstract boolean comandaEnviada();
    public abstract boolean comandaRebuda();
    public abstract float preuEnviament();

    @Override
    public String toString() {
        return "Comanda{" + "Tipus=" + tipus + ", Client=" + client.getNom() + ", Article=" + article.getNom() + ", Quantitat=" + quantitat + ", Data=" + data.getTime() + ", Enviat=" + enviat + ", Rebuda=" + rebuda + ", Preu Articles=" + this.calcPreu() + ", preuEnv=" + preuEnv + '}';
    }

    
}
