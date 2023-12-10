/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cumepassa.curso;

import java.util.*;

/**
 *
 * @author otavio.almeida
 */
public class Curso {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa;
        System.out.println("Digite quantas pessoas deseja cadastrar: ");

        int cadastros = input.nextInt();
        cadastro(cadastros);
        input.close();
    }
    
    
 public static List<Pessoa>/*Aqui é o tipo de retorno, então ele vai retornar uma lista do tipo pessoa*/ cadastro(int qtd){
    Scanner input = new Scanner(System.in);
    List<Pessoa> pessoa =  new ArrayList<>();
    
    for (int i = 0; i < qtd; i++) {
        
        System.out.println("Digite seu id: ");
        int id = input.nextInt();
        input.nextLine();  // Adicionado
        
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();  // Modificado para nextLine()
        
        System.out.println("Digite seu salário: ");  
        double salario = input.nextDouble();
        input.nextLine();  // Adicionado
        
        var cadastrar = new Pessoa(id, nome, salario);
        pessoa.add(cadastrar);
    }
    
    System.out.println("Digite o id do usuário que deseja encontrar: ");

    int id = input.nextInt();
    input.nextLine();  // Adicionado
    acharNome(pessoa, id);
    
    for(Pessoa x: pessoa){
        System.out.println(x);
    }
    return pessoa;
}

    // o Tipo da função é Pessoa então o return dele vai ter que ser da clase Pessoa
    public static Pessoa acharNome(List<Pessoa> list, int id){
        Pessoa pessoa = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        //Aqui ele achou uma pessoa
        receberAumento(pessoa);
        return pessoa;
    }
    
    public static String receberAumento(Pessoa pessoa){
        double salario = pessoa.getSalario();
         salario += (10.0/100) * salario;
         pessoa.setSalario(salario);
         // Convertendo um objeto pra um Texto
       return "Seu novo salário é " + String.valueOf(salario);
    }
    
}
