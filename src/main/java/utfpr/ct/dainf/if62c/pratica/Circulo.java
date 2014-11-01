/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author aron
 */
public class Circulo extends Elipse{
    
    public Circulo(){
        super();
        r=1;
    }
    public Circulo(double r){
        super(r,r);
    }
    public double getPerimetro(){
        return 2*Math.PI*r;
    }
}
