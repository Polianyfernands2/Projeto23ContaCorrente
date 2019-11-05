/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto23contacorrente;

/**
 *
 * @author aluno
 */
public class Endereco {
    protected String rua;
    protected String numero;
    protected String cidade;
    protected String estado;
    protected String CEP;
    protected Pessoa reside;
    
    public Endereco(){
        
    }

    public Endereco(String rua, String numero, String cidade, String estado, String CEP, Pessoa reside) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
        this.reside = reside;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public Pessoa getReside() {
        return reside;
    }

    public void setReside(Pessoa reside) {
        this.reside = reside;
    }
    
}
