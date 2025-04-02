
package atividade0104pilha;

import java.time.LocalDate;

public class Pilha<T> {
    
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
    
    private T[] elementos;
    private int topo;
    
    
    public Pilha(int tamanho) {        
        this.elementos = (T[]) new Object[tamanho];        
        this.topo = -1;        
    }
    
    public boolean isEmpty(){        
        return this.topo == -1;
    }
    
    public boolean isFull(){        
        return this.elementos.length -1 == this.topo ;        
    }
    
    public boolean push(T dado){
        if(!this.isFull()){
            this.elementos[++this.topo] = dado;
            return true;
        }// fim if
        return false;
    }
    
    public T pop(){
        
            return this.elementos[this.topo--];
            
    }
    
    public T peek(){
        
            return this.elementos[this.topo];
            
    }
    
    @Override
    public String toString(){
        StringBuilder retorno = new StringBuilder("Topo\n");
        
        for(int i = this.topo; i>=0; i--){
            retorno.append(this.elementos[i]+"\n");
        }
        
        return retorno.toString();
    }
    
}