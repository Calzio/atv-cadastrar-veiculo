/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroveiculo;

/**
 *
 * @author aluno.den
 */
public class Carro extends Veiculo{
    private int NPortas;

    public Carro(String marca, String modelo, int NPortas) {
        super(marca, modelo);
        this.NPortas = NPortas;
    }

    public int getNPortas() {
        return NPortas;
    }

    public void setNPortas(int NPortas) {
        this.NPortas = NPortas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de portas:" + NPortas;
    }

  
}


      
