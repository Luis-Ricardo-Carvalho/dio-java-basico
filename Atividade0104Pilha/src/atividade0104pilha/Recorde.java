/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade0104pilha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 13692494629
 */
public class Recorde {
    
    private LocalDate dataRecord;
    private double tempo = 0;
    private String nome;

    public LocalDate getDataRecord() {
        return dataRecord;
    }

    public void setDataRecord(LocalDate dataRecord) {
        this.dataRecord = dataRecord;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public String toString(){
        String dataFormatada =
                dataRecord.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return "Nome: " +this.nome + " Tempo: " +this.tempo
                + " Data: " +dataFormatada;
        
    }
    
}
