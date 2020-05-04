/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Primos {
    private Integer numFirst;
    private Integer numSecond;

    public Primos() {
    }

    public Primos(Integer numFirst, Integer numSecond) {
        this.numFirst = numFirst;
        this.numSecond = numSecond;
    }

    public Integer getNumMenor() {
        return numFirst;
    }

    public void setNumMenor(Integer numFirst) {
        this.numFirst = numFirst;
    }

    public Integer numSecond() {
        return numSecond;
    }

    public void setNumMaior(Integer numSecond) {
        this.numSecond = numSecond;
    }
    
    public void identidficador(){
        
        for(Integer i =numFirst; i<=numSecond; i++){
        int res=i%2;
           
        if(res==0){
            
            System.out.println("numero numeros primo entre os intervalos"+i);
        }
        
    
   
    }
    }
    
}

