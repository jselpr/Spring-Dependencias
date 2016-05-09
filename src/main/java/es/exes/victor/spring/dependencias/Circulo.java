/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.exes.victor.spring.dependencias;

/**
 *
 * @author joselopezruiz
 */
public class Circulo implements Operaciones{
        private int radio;
    public Circulo() {
    }
    public Circulo(int radio) {
        this.radio = radio;
    }
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    public double area() {
        return Math.PI*radio*radio;
    }
    public double perimetro() {
        return 2*Math.PI*radio;
    }

}
