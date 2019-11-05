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
public class Projeto23ContaCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Pessoa objPessoa = new Pessoa();
    objPessoa.setNome("Victor Adriano");
    objPessoa.setSobrenome(" Aquino Cracco");
    objPessoa.setCPF(" 35436154665");
    objPessoa.ValidarCPF(" 5436154665");
        
    Conta objConta = new Conta();
    objConta.setNumero(2112);
    objConta.setSaldo( 90 );
    objConta.setLimite( 2400 );
    objPessoa.setDono(objConta);
    
    Endereco objEnd = new Endereco();
    objEnd.setRua(" Dos Bobos");
    objEnd.setNumero(" 69");
    objEnd.setCidade(" Lins");
    objEnd.setEstado(" Calamidade");
    objEnd.setCEP(" 16400000");
        System.out.println("Pessoa: "  + objPessoa.getNome() 
             +objPessoa.getSobrenome() 
             +objPessoa.getCPF());
        System.out.println("Conta: " + objConta.getNumero( ) 
             +objConta.getSaldo( ) 
             +objConta.getLimite( ));
        System.out.println("Endereco: " + objEnd.getRua() 
             +objEnd.getNumero() 
             +objEnd.getCidade()
             +objEnd.getEstado()
             +objEnd.getCEP());
    }
}
