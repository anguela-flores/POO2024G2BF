/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.claseinterna;


public class principal {
    
    public static void main(String[] args) {
        mama ma=new mama ();
        System.out.println("La mama provee" +ma.alimento);
        mama.Bebe bb=ma.new Bebe();
        System.out.println("Su bebe tiene un peso"+bb.peso+"Kg");
    }
}
