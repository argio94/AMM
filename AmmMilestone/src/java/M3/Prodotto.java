/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3;

/**
 *
 * @author User
 */
public class Prodotto {
    private String nome;
    private String urlFoto;
    private int pezziDisponibili;
    private int prezzo;
    
    public Prodotto() {
        nome = "";
        urlFoto = "";
        pezziDisponibili = 0;
        prezzo = 0;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the urlFoto
     */
    public String getUrlFoto() {
        return urlFoto;
    }

    /**
     * @param urlFoto the urlFoto to set
     */
    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    /**
     * @return the pezziDisponibili
     */
    public int getPezziDisponibili() {
        return pezziDisponibili;
    }

    /**
     * @param pezziDisponibili the pezziDisponibili to set
     */
    public void setPezziDisponibili(int pezziDisponibili) {
        this.pezziDisponibili = pezziDisponibili;
    }

    /**
     * @return the prezzo
     */
    public int getPrezzo() {
        return prezzo;
    }

    /**
     * @param prezzo the prezzo to set
     */
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
}
