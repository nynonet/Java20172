/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendendo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Andeson
 */
public class Aprendendo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //criando um objeto que herda da classe JFrame
        JFrame janela = new JFrame("Reforço de Aula");
        //definindo o tamanho do formulário
        janela.setSize(600, 400);
        
        //criando um botão para fechar o formulário
        Button fecha = new Button("Clique para Sair");
        //criando o botão para mensagem ao usuário
        Button mensagem = new Button("Mensagem");
        
        //adicionando os botões no Formulário
        janela.add(mensagem);
        janela.add(fecha);
        
        //criando a ação para o botão fechar
        fecha.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        } );
        
        //criando a ação para o botão Mensagem
        mensagem.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome;
                nome = JOptionPane.showInputDialog("Qual seu nome?");
                
                JOptionPane.showMessageDialog(janela, 
                        "O nome que informou foi:\n"+nome);
            }
        } );
        
        //criando o gerenciador de layouts FLOWLAYOUT 
        FlowLayout layout = new FlowLayout();
        //definindo o alinhamento dos componenetes
        layout.setAlignment(FlowLayout.RIGHT);
        //atribuindo o layout ao nosso formulário 
        janela.setLayout(layout);
        
        //tornar visivel o formulário ao usuário.
        janela.setVisible(true);
        
    }
    
}
