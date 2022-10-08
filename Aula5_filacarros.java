/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula5_filacarros;

/**
 *
 * @author Dell
 */
public class Aula5_filacarros {

    public static void main(String[] args) {
        Carro A = new Carro();
        Carro B = new Carro();
        Carro C = new Carro();
        Carro D = new Carro();
        Carro E = new Carro();
        Carro F = new Carro();
        Carro G = new Carro();
        Carro H = new Carro();
        Carro I = new Carro();
        Carro J = new Carro();
        Carro K = new Carro();
        Carro L = new Carro();
        Carro M = new Carro();
        Carro N = new Carro();
        Carro O = new Carro();
        Carro Resp = new Carro();
        
        A.id = 1;
        A.marca = "Fiat";
        A.cor = "Branco";
        A.ano = 2002;
        
        B.id = 2;
        B.marca = "Chevrolet";
        B.cor = "Vermelho";
        B.ano = 1998;
        
        C.id = 3;
        C.marca = "Wolkswagen";
        C.cor = "Grafite";
        C.ano = 2012;
        
        D.id = 4;
        D.marca = "Fiat";
        D.cor = "Preto";
        D.ano = 2009;
        
        E.id = 5;
        E.marca = "Dodge";
        E.cor = "Azul";
        E.ano = 2019;
        
        F.id = 6;
        F.marca = "Honda";
        F.cor = "Verde";
        F.ano = 2016;
        
        G.id = 7;
        G.marca = "Mitsubishi";
        G.cor = "Cinza";
        G.ano = 2020;
        
        H.id = 8;
        H.marca = "Ferrari";
        H.cor = "Vermelha";
        H.ano = 2022;
        
        I.id = 9;
        I.marca = "BMW";
        I.cor = "Preta";
        I.ano = 2014;
        
        J.id = 10;
        J.marca = "Chevrolet";
        J.cor = "Branco";
        J.ano = 2013;
        
        K.id = 11;
        K.marca = "Fiat";
        K.cor = "Vinho";
        K.ano = 2017;
        
        L.id = 12;
        L.marca = "Dodge";
        L.cor = "Verde";
        L.ano = 2010;
        
        M.id = 13;
        M.marca = "Honda";
        M.cor = "Rosa";
        M.ano = 2008;
        
        N.id = 14;
        N.marca = "Lamborgini";
        N.cor = "Amarela";
        N.ano = 2015;
        
        O.id = 15;
        O.marca = "Fiat";
        O.cor = "Laranja";
        O.ano = 2021;
        
        Fila FL = new Fila();
        Fila FL2 = new Fila();

        FL.insere(A);
        FL.insere(B);
        FL.insere(C);
        
        if(FL.fila_vazia()){ //chama a checagem se a fila está vazia da classe fila
            System.out.println("A fila está vazia, não posso remover nenhum carro.");
        }else{
            FL2.insere(Resp);
            Resp = FL.remove();//chama a função de remoção da classe fila
            FL2.imprimir(Resp);
        }
        
        FL.insere(D);
        FL.insere(E);
        FL.insere(F);
        
        if(FL.fila_vazia()){
            System.out.println("A fila está vazia, não posso remover nenhum aluno.");
        }else{
            FL2.insere(Resp);
            Resp = FL.remove();
            FL2.imprimir(Resp);
        }
        
        FL.insere(G);
        FL.insere(H);
        FL.insere(I);
        
        if(FL.fila_vazia()){
            System.out.println("A fila está vazia, não posso remover nenhum aluno.");
        }else{
            FL2.insere(Resp);
            Resp = FL.remove();
            FL2.imprimir(Resp);
        }
        
        FL.insere(J);
        FL.insere(K);
        FL.insere(L);
        
        if(FL.fila_vazia()){
            System.out.println("A fila está vazia, não posso remover nenhum aluno.");
        }else{
            FL2.insere(Resp);
            Resp = FL.remove();
            FL2.imprimir(Resp);
        }
        
        FL.insere(M);
        FL.insere(N);
        FL.insere(O);
        
        if(FL.fila_vazia()){
            System.out.println("A fila está vazia, não posso remover nenhum aluno.");
        }else{
            FL2.insere(Resp);
            Resp = FL.remove();
            FL2.imprimir(Resp);
        }
        
        System.out.println("-------------------");
        System.out.println("Lista de Carros da Fila 1:");
        FL.geral();
        System.out.println("-------------------");
        System.out.println("Lista de Carros da Fila 2:");
        FL2.geral();
    
 
    }
}
