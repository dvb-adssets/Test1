/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellothread;

/**
 * This is a thread that prints a swedish christmas song.
 * Good luck getting it out of your head now.
 * 
 * @author Baronen
 */
public class T2 extends Thread {

    private boolean active;

    public T2() {
        super();
        active = true;
        start();
    }

    /**
     * Prints the message to the output and pauses the thread in the given
     * amounts of milliseconds.
     * 
     * @param message the message
     * @param milliSeconds the pause time in milliseconds
     */
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

    /**
     * Runs the song
     */
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
