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
public class ComandaUrgent extends Comanda {
    
    public ComandaUrgent(Client client, Article article,int quantitat, boolean enviat, boolean rebuda){
        super("Urgent",client,article,quantitat,enviat,rebuda,4,1);
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
        return this.preuEnviament();
    }
    
}
