/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bruno
 */
public class Usuario {
    
    private int cdusuari;
    private String nmusuari;

    public Usuario(int cdusuari, String nmusuari) {
        this.cdusuari = cdusuari;
        this.nmusuari = nmusuari;
    }

    public int getCdusuari() {
        return cdusuari;
    }

    public void setCdusuari(int cdusuari) {
        this.cdusuari = cdusuari;
    }

    public String getNmusuari() {
        return nmusuari;
    }

    public void setNmusuari(String nmusuari) {
        this.nmusuari = nmusuari;
    }
    
    
}
