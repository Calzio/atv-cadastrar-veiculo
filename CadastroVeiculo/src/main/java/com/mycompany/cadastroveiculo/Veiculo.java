/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroveiculo;

/**
 *
 * import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

private void salvarCarrosEmArquivo() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("carros.txt"))) {
        for (Carro c : listaCarro) {
            writer.write(c.getMarca() + ";" + c.getModelo() + ";" + c.getNPortas());
            writer.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar os dados: " + e.getMessage());
    }
}
* 
* 
* 
* 
* 
* import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

private void carregarCarrosDoArquivo() {
    try (BufferedReader reader = new BufferedReader(new FileReader("carros.txt"))) {
        String linha;
        while ((linha = reader.readLine()) != null) {
            String[] dados = linha.split(";");
            String marca = dados[0];
            String modelo = dados[1];
            int nPortas = Integer.parseInt(dados[2]);
            Carro c = new Carro(marca, modelo, nPortas);
            listaCarro.add(c);
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Erro ao carregar os dados: " + e.getMessage());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Erro ao processar os dados: " + e.getMessage());
    }
}
* 
* 
* 
* 
* 
* 
* 
* private void btnCadastrarCarroActionPerformed(java.awt.event.ActionEvent evt) {                                                  
    try {
        String marcaC = txtMarcaCarro.getText();
        String modeloC = txtModeloCarro.getText();
        String nPortasText = txtNPortas.getText();
        int nPortas = Integer.parseInt(nPortasText);

        Carro c = new Carro(marcaC, modeloC, nPortas);
        listaCarro.add(c);
        salvarCarrosEmArquivo(); // Salva os dados após cadastrar
        JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");

        txtMarcaCarro.setText("");
        txtModeloCarro.setText("");
        txtNPortas.setText("");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Número de portas inválido.");
    }
}

// Chame este método no construtor ou no método de inicialização
private void initComponents() {
    carregarCarrosDoArquivo(); // Carrega os dados ao iniciar
    // ... restante do código de inicialização
}
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
 * @author aluno.den
 */
public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
    
    
    
}
