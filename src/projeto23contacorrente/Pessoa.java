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
public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected String CPF;
    protected Conta dono;
    
    public Pessoa(){
        
    }

    public Pessoa(String nome, String sobrenome, String CPF, Conta dono) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Conta getDono() {
        return dono;
    }

    public void setDono(Conta dono) {
        this.dono = dono;
    }
     public void ValidarCPF(String CPF) {
      if((this.CPF!=null) && (CPF.equals(this.getCPF())))
          System.out.println("CPF:" + this.getCPF()+ " Validado com sucesso!");
      else 
          System.out.println("CPF: " + this.getCPF()+ " Invalido");
          
     } 
     public void getNomeCompleto(){
         System.out.println("Victor Adriano Aquino Cracco");
     }
    
}
