/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Projeto01;

import java.time.LocalDate;

/**
 *
 * @author L
 */
public class Record {

    LocalDate data;
    double tempo;
    String nome;
    
    public LocalDate getData() {
        return this.data;
    }

    public double getTempo() {
        return this.tempo;
    }
        
    public String getNome() {
        return this.nome;
    }

    public void setRecord(LocalDate data, double tempo, String nome){
        this.data = data;
        this.tempo = tempo;
        this.nome = nome;
    }
    
}
