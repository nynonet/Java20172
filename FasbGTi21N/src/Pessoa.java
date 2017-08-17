/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andeson
 */
public class Pessoa {

    private int idade; //Idade da Pessoa
    private String pele; //Cor da Pele da Pessoa   
    private String sexo; //Sexo da Pessoal Masculino ou Feminino
    private String nome; //Nome Completo da Pessoa
    private Double altura; //Altura da Pessoa
    private Double peso; //Peso da Pessoa
    private String olhos; //Cor dos Olhos da Pessoa 

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setPele(String pele) {
        this.pele = pele;
    }

    public String getPele() {
        return this.pele;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAltura() {
        return this.altura;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public void setOlhos(String olhos) {
        this.olhos = olhos;
    }

    public String getOlhos() {
        return olhos;
    }

}
