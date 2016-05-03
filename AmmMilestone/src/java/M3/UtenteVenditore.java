/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3;

import java.util.ArrayList;


/**
 *
 * @author Alessandro Argiolas 49062
 */
public class UtenteVenditore extends UtenteGenerico {
    private ArrayList<Prodotto> oggettoVendi = new ArrayList<Prodotto>();
    
    public UtenteVenditore() {
        super();
    }

    /**
     * @return the oggettoVendi
     */
    public ArrayList<Prodotto> getOggettoVendi() {
        return oggettoVendi;
    }

    /**
     * @param oggettoVendi the oggettoVendi to set
     */
    public void setOggettoVendi(ArrayList<Prodotto> oggettoVendi) {
        this.oggettoVendi = oggettoVendi;
    }
}
