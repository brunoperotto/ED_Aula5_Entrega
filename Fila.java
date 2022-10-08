/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula5_filacarros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Fila {
    List <Carro> carro = new ArrayList<>();
    
    //PROCEDIMENTOS
    
    void insere(Carro A){
        this.carro.add(A);
        }

    
    void imprimir(Carro a){
        System.out.println("-----------------------------");
        System.out.println("O seguinte carro terminou de ser lavado e movido para a Fila 2:");
        System.out.println("O ID do carro é: "+a.id);
        System.out.println("A marca do carro é: "+a.marca);
        System.out.println("O ano do carro é: "+a.ano);
        System.out.println("A cor do carro é: "+a.cor);
    }
    
    void geral(){
        while(!carro.isEmpty()){
            System.out.println(carro.remove(0));
        }
    }
    
    //FUNÇÕES
    
    Carro remove(){
        return(this.carro.remove(0)); //remove o primeiro índice da fila
    }
    
    boolean fila_vazia(){
        return(this.carro.isEmpty()); //verificar se a fila está vazia
    }
    
}
    /*
    List <Carro> carro = new ArrayList<>();
    
    void insere(Carro A){
        this.carro.add(A);
    }
    
    Carro remove(){
        return this.carro.remove(0);
    }
    
    boolean fila_vazia(){
        return(this.carro.isEmpty());
    }
*/

