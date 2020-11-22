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
 * Deskripsi Program : Program ini berisi class abstract LivigThing
 */
public abstract class LivingThing {
    
    public abstract void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama.concat(" Bernafas."));
    }    
    
    public void eat(String nama) {
        System.out.println(nama.concat(" Makan."));
    }    
}
    
