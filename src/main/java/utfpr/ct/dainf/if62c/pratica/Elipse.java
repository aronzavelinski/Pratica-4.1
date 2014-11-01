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
public class Elipse {
    protected double r, s;
    
    public Elipse(){
        
    }
    public Elipse(double r, double s){
           this.r = r;
           this.s = s;
    }
    public double getArea(){
        return Math.PI*r*s;
    }
    public double getPerimetro(){
        return Math.PI*(3*(r+s)-Math.sqrt((3*r+s)*(r+3*s)));
    }
}
