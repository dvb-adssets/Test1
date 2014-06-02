/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hellothread;

/**
 *
 * @author Baronen
 */
public class HelloThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new T1();
        T2 t = new T2();
        t.start();
    }
}
