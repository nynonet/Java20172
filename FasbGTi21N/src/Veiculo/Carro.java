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
public class Carro {

    private String cor;
    private int ano;
    private String modelo;
    private int nPortas; //Número de Portas
    private double pMotor; //Potência do Motor
    private int qRodas; //Quantidade de Rodas;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    public double getpMotor() {
        return pMotor;
    }

    public void setpMotor(double pMotor) {
        this.pMotor = pMotor;
    }

    public int getqRodas() {
        return qRodas;
    }

    public void setqRodas(int qRodas) {
        this.qRodas = qRodas;
    }
    

}
