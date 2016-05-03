/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UtenteCliente extends UtenteGenerico {
    private ArrayList<Prodotto> oggettoCompra = new ArrayList<Prodotto>();

    public UtenteCliente() {
        super();
    }

    /**
     * @return the oggettoCompra
     */
    public ArrayList<Prodotto> getOggettoCompra() {
        return oggettoCompra;
    }

    /**
     * @param oggettoCompra the oggettoCompra to set
     */
    public void setOggettoCompra(ArrayList<Prodotto> oggettoCompra) {
        this.oggettoCompra = oggettoCompra;
    }
}

