/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3;

/**
 *
 * @author Alessandro Argiolas 49062
 */

public abstract class UtenteGenerico {   
    private String nome;
    private String cognome;
    private String username;
    private String password;
    private String indirizzo;
    private String mail;
    private String numero;
    private String codiceCarta;  
    private Saldo saldo;
    
    public UtenteGenerico() {
        nome = "";
        cognome = "";
        username = "";
        password = "";
        indirizzo = "";
        mail = "";
        numero  = "";
        codiceCarta = "";
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
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * @param indirizzo the indirizzo to set
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the codiceCarta
     */
    public String getCodiceCarta() {
        return codiceCarta;
    }

    /**
     * @param codiceCarta the codiceCarta to set
     */
    public void setCodiceCarta(String codiceCarta) {
        this.codiceCarta = codiceCarta;
    }

    /**
     * @return the saldo
     */
    public Saldo getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }
}
