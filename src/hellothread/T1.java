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
public class T1 implements Runnable {
    
    boolean active;
    
    Thread t;
    
    public T1() {
        active = true;
        t = new Thread(this);
        t.start();
    }
    
    public void run() {
        while(active) {
            System.out.println("Tick...");
            try {
                t.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Tock...");
            try {
                t.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
