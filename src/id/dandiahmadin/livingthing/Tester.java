/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.livingthing;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi kehidupan manusia dengan pendekatan object oriented
 * dan penerapan konsep pewarisan, abstract
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LivingThing dandi = new Human();
        dandi.walk("Dandi Ahmadin");
        dandi.breath("Dandi Ahmadin");
        dandi.eat("Dandi Ahmadin");
    }
    
}
