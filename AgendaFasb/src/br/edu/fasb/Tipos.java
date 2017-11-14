/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasb;

/**
 *
 * @author Andeson
 */
public enum Tipos {
    AMIGOS  (1, "Chegado"), 
    FAMILIA (2, "Importante"), 
    TRABALHO(3, "Para alguns ..."), 
    AMORES  (4, "Sem não vivemos"), 
    FESTA   (5, "Sempre é bom!"), 
    OUTROS  (6, "Coisas Diversas da Vida");
    
    private int id;
    private String apelido;

    private Tipos(int id, String apelido) {
        this.id = id;
        this.apelido = apelido;
    }

    public int getId() {
        return id;
    }

    public String getApelido() {
        return apelido;
    }
    
}
