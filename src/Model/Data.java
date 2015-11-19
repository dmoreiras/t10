/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author debora
 */
public class Data {
    public int dia;
    public int mes;
    public int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 30)
            System.out.println("Data invalida");
        else
            this.dia = dia;        
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 12)
            System.out.println("Data invalida");
        
        else
            this.mes = mes;
    }
    

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data: " + dia + "/" + mes + "/" + ano;
    }
    
    
    
    
}
