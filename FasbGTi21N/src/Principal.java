/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andeson
 */
public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Olá turma GTI 2017.2");  
                
        Pessoa pes1 = new Pessoa();
        pes1.setIdade(500);
        pes1.setNome("Monstro");
        pes1.setOlhos("Grades e Roxo");
        pes1.setPele("Aspera e Marrom bombom");
        pes1.setAltura(3.0);
        pes1.setPeso(350.0);
       
        pes1.setSexo("Indefinido");
        System.out.println( "Nome: "+ pes1.getNome() );
        System.out.println( "Idade: "+ pes1.getIdade() + " anos" );
        System.out.println( "Peso: "+ pes1.getPeso() + "Kg" );
        
        Pessoa pes2 = new Pessoa();
  
//        System.out.println( pes1.nome );
//        System.out.println( pes2.nome );

    }
    
}
