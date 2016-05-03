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
public class Factory {
    private static Factory singleton;
    public static Factory getInstance() {
        if (singleton == null) {
            singleton = new Factory();
        }
        return singleton;
    }
    
    private ArrayList<Prodotto> listaOggetti = new ArrayList<Prodotto>();
    private ArrayList<UtenteGenerico> listaClienti = new ArrayList<UtenteGenerico>();
    private ArrayList<UtenteGenerico> listaVenditori = new ArrayList<UtenteGenerico>();
    
    private Factory() {
        Prodotto obj_1 = new Prodotto();
        obj_1.setNome("Baker verde pua");
        obj_1.setUrlFoto("img/baker1.jpg");
        obj_1.setPezziDisponibili(50);
        listaOggetti.add(obj_1);
        Prodotto obj_2 = new Prodotto();
        obj_1.setNome("Baker reynolds blue");
        obj_1.setUrlFoto("img/baker2.jpg");
        obj_1.setPezziDisponibili(50);
        listaOggetti.add(obj_1);
        Prodotto obj_3 = new Prodotto();
        obj_1.setNome("Blind rossa bianca");
        obj_1.setUrlFoto("img/blind1.jpg");
        obj_1.setPezziDisponibili(50);
        listaOggetti.add(obj_1);
        Prodotto obj_4 = new Prodotto();
        obj_1.setNome("Element Mark Rossa");
        obj_1.setUrlFoto("img/element1.jpg");
        obj_1.setPezziDisponibili(50);
        listaOggetti.add(obj_1);
        Prodotto obj_5 = new Prodotto();
        obj_1.setNome("PlanB bianca verde");
        obj_1.setUrlFoto("img/planb1.jpg");
        obj_1.setPezziDisponibili(50);
        listaOggetti.add(obj_1);
        
        Saldo saldo = new Saldo();
    
    
        UtenteCliente cliente_1 = new UtenteCliente();
        cliente_1.setNome("Alessandro");
        cliente_1.setCognome("Argiolas");
        cliente_1.setUsername("argio94");
        cliente_1.setPassword("password");
        cliente_1.setIndirizzo("Via Dalmazia 325");
        cliente_1.setMail("a.argiolas@hotmail.it");
        cliente_1.setNumero("3482537843");
        cliente_1.setCodiceCarta("1423568770971535");
        saldo.setSaldo(1500);
        cliente_1.setSaldo(saldo);
        ArrayList<Prodotto> prodottiAcquistatiCliente_1 = new ArrayList<Prodotto>();
        prodottiAcquistatiCliente_1.add(obj_1);
        prodottiAcquistatiCliente_1.add(obj_2);
        cliente_1.setOggettoCompra(prodottiAcquistatiCliente_1);
        listaClienti.add(cliente_1);
        
        UtenteVenditore venditore_1 = new UtenteVenditore();
        venditore_1.setNome("Luca");
        venditore_1.setCognome("Fadda");
        venditore_1.setUsername("sgalla94");
        venditore_1.setPassword("password");
        venditore_1.setIndirizzo("Piazza la bomba e scappa");
        venditore_1.setMail("l.fadda@hotmail.it");
        venditore_1.setNumero("3283646848");
        venditore_1.setCodiceCarta("1423568770971535");
        saldo.setSaldo(1700);
        venditore_1.setSaldo(saldo);
        ArrayList<Prodotto> prodottiVendutiVenditore_1 = new ArrayList<Prodotto>();
        prodottiVendutiVenditore_1.add(obj_1);
        prodottiVendutiVenditore_1.add(obj_2);
        venditore_1.setOggettoVendi(prodottiVendutiVenditore_1);
        listaVenditori.add(venditore_1);
    }
    
    public ArrayList<UtenteGenerico> getListaClienti()
    {
        return listaClienti;
    }
    
    public UtenteGenerico getCliente(String username)
    {
        for(UtenteGenerico u : listaClienti)
        {
            if(u.getUsername().equals(username))
                return u;
        }
        
        return null;
    }
    public ArrayList<UtenteGenerico> getListaVenditori()
    {
        return listaVenditori;
    }
    public UtenteGenerico getVenditore(String username)
    {
        for(UtenteGenerico u : listaVenditori)
        {
            if(u.getUsername().equals(username))
                return u;
        }
        
        return null;
    }
    
    public ArrayList<UtenteGenerico> getListaUtentiGenerici() 
    {
        ArrayList<UtenteGenerico> listaUtentiGenerici = new ArrayList<UtenteGenerico>();
        
        listaUtentiGenerici.addAll(listaClienti);
        listaUtentiGenerici.addAll(listaVenditori);
        
        return listaUtentiGenerici;
    }
}
