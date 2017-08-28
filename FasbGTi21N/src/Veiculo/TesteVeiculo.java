/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veiculo;

/**
 *
 * @author Andeson
 */
public class TesteVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Sport bmw = new Sport();
        bmw.setAno(2017);
        bmw.setCor("VERMELHA");
        
        System.out.println(bmw.getAno() + "\n"+ 
             bmw.getCor()+ "\n"+ bmw.getnPortas()+
             "\n"+bmw.getpMotor());
  
        Passeio siena = new Passeio(4, 1.8);
        siena.setAno(2016);
        siena.setCor("PRATA");
        siena.setqRodas(4);
        
        System.out.println(siena.getAno() + "\n"+ 
             siena.getCor()+ "\n"+ siena.getnPortas()+
             "\n"+siena.getpMotor());
        
        
        Caminhonete f1000 = new Caminhonete();
        f1000.setModelo("F-1000");
        f1000.setAno(1994);
        
        Caminhao volvo = new Caminhao(6, 3.3);
        volvo.setAno(2005);
        volvo.setCor("Azul");
        
        
    }

}
