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

    private void printTime(String message, int milliSeconds) {
        System.out.println(message);
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private void tippTapp() {
        printTime("Tipp", 500);
        printTime("Tapp", 500);
    }

    private void tippe() {
        printTime("Tippe-", 500);
    }

    private void endSong() {
        printTime("Tipp...", 1000);
        printTime("Tipp...", 1000);
        printTime("Tapp", 500);
        printTime("Tipp!", 500);
        printTime("Tapp!", 500);
    }

    private void pauseSec() {
        printTime("", 500);
    }

    public void run() {
        while (active) {
            tippTapp();
            tippTapp();
            tippe();
            tippe();
            tippTapp();
            endSong();
            pauseSec();
        }
    }
}
