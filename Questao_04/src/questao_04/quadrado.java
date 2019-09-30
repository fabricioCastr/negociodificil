/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_04;

/**
 *
 * @author fabri
 */
class quadrado {
    double lado;
    
    public quadrado(double lado){
        this.lado = lado;
    }
    public double area(){
        return lado*lado;
    }    
    public double perimetro(){
        return 4*lado;
    }
            
        
    
}
