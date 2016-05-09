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
public class Calculos {
    private Operaciones oper;
    public Calculos() {
    }   
    public Calculos(Operaciones oper){
        this.oper=oper;
    }
    public Operaciones getOper() {
        return oper;
    }
    public void setOper(Operaciones oper) {
        this.oper = oper;
    }
    public void mostrarDatos(){
        System.out.println("area de la figura: "+oper.area());
        System.out.println("perímetro de la figura: "+oper.perimetro());
    }

}
