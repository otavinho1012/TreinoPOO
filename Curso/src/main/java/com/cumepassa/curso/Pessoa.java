/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cumepassa.curso;

/**
 *
 * @author otavio.almeida
 */
public class Pessoa {
        private int id;
        private String nome;
        public double salario;
    
        
    public Pessoa(int id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public  double getSalario(){
        return salario;
    }
    
     public  void setSalario(double salario){
        this.salario = salario;
    }
    
    
    
        @Override
    public String toString(){
        return "Pessoas: {\n"
                + "  Id: " + id + "\n"
                + "  Nome: " + nome + "\n"
                + "  Salario: " + salario + "\n"
                + "}";
    }
   
}
