package controller;

/**
 *
 * @author natbr
 */

import model.Automovel;

public class Loja {

    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        Automovel a = new Automovel();
        a.setMarca("Chevrolet");
        a.setModelo("Chevrolet Corvette C3");
        a.setTipo("Corvette Coupe");
        System.out.println("Marca: " + a.getMarca() + " Modelo: " + a.getModelo() + " Tipo: " + a.getTipo());
        
        Automovel b = a.clone();
        System.out.println("Marca: " + b.getMarca());
        
        b.setModelo("Chevrolet Corvette 6.2 Stingray");
        System.out.println("Marca: " + b.getMarca() + " Modelo : " + b.getModelo() + " Tipo: " + b.getTipo());
    }
}
