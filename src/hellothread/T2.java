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
public class T2 extends Thread {

    boolean active;

    public T2() {
        super();
        active = true;
    }

    private void tippTapp() {

        System.out.println("Tipp...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Tapp...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private void tippe() {
        System.out.println("Tippe-");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void run() {
        while (active) {
            tippTapp();
            tippTapp();
            tippe();
            tippe();
            tippTapp();
        }
    }
}
