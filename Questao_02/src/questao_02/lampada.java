/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_02;

/**
 *
 * @author fabri
 */
class lampada {

    boolean ligada ;
    
    void liga(){
        ligada = true;
    }
    void desliga(){
        ligada = false;
    }
    
    String observa(){
       
        if(ligada == true){
            System.out.println("ligada");
            
        }else {
            System.out.println("Desligada");
        }
        return null;
    }
    
    
}
