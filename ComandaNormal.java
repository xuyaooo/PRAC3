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
public class ComandaNormal extends Comanda{
    /*
    public Comanda(String tipus,Client client, Article article,int quantitat, boolean enviat,boolean rebuda,int preuEnv)
    */
    
    public ComandaNormal(Client client, Article article,int quantitat, boolean enviat, boolean rebuda, int preuEnv){
        super("Normal",client,article,quantitat,enviat,rebuda,preuEnv);
    }
            
            

    @Override
    public String tipusComanda() {
        return this.getTipus();
    }

    @Override
    public boolean comandaEnviada() {
        return this.isEnviat();
    }

    @Override
    public boolean comandaRebuda() {
        return this.isRebuda();
    }

    @Override
    public float preuEnviament() {
        return this.getPreuEnv();
    }
    
}
