/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
import utfpr.ct.dainf.if62c.pratica.*;


public class Pratica41 {
    public static void main(String[] args) {
        Elipse ep = new Elipse(2, 3);
        Circulo c = new Circulo(3);
        
        System.out.println(ep.getArea());
        System.out.println(ep.getPerimetro());
        System.out.println(c.getArea());
        System.out.println(c.getPerimetro());        
    }
}
