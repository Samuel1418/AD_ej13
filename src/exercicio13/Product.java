/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio13;

import java.io.Serializable;

/**
 *
 * @author oracle
 */
public class Product implements Serializable{

    private String cod;
    private String desc;
    private double prezo;

    public Product(String cod, String desc, double prezo) {
        this.cod = cod;
        this.desc = desc;
        this.prezo = prezo;
    }

    public Product() {
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Product{" + "cod=" + cod + ", desc=" + desc + ", prezo=" + prezo + '}';
    }

    
    
    
    
}
