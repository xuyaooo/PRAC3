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
public class ClientPremium extends Client{
    public ClientPremium(String tipus, String email, String nom, String adreca, float descompteEnv, float mensualitat){
        super("Premium",email,nom,adreca,80,4);
    }

    @Override
    public String tipusClient() {
        return this.getTipus();
    }

    @Override
    public float calcMensual() {
        return this.getMensualitat();
    }

    @Override
    public float descompteEnv() {
        return this.getDescompteEnv();
    }
}
