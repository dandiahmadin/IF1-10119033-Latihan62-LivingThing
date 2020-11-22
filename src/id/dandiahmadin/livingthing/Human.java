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
 * Deskripsi Program : Program ini berisi class Human yang merupakan subclass dari class abstract 
 * LivingThing (superclass)
 */
public class Human extends LivingThing {
    private String nama;

    @Override
    public void walk(String nama) {
        System.out.println(nama.concat(" sedang berjalan."));
    }
}
