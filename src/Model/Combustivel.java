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
public class Combustivel {
    private Posto posto;
    private String tipo;
    private Data data_preco;
    private float preco;

    public Posto getPosto() {
        return posto;
    }

    public void setPosto(Posto posto) {
        this.posto = posto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Data getData_preco() {
        return data_preco;
    }

    public void setData_preco(Data data_preco) {
        this.data_preco = data_preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Combustivel: " + tipo + "   Preço: " + preco + "   data: " + data_preco;                
    }


    
    
}
