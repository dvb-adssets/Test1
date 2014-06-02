/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellothread;

/**
 * Prints the sound a clock makes.
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

    private void printSecond(String message) {
        System.out.println(message);
        try {
            t.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void run() {
        while (active) {
            printSecond("Tick...");
            printSecond("Tack...");
        }
    }
}
