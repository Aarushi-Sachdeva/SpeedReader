/**
 * Program to implement RSVP speed reader using StdDraw library
 * 
 * @author Chris Murphy
 */
import java.awt.Color;
import java.io.*;
import java.util.*;
public class SpeedReader {

    public static void main(String[] args) {

        StdDraw.setCanvasSize(800, 400);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);

        // this enables animation so that things don't appear jittery
        StdDraw.enableDoubleBuffering();

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setFont(new java.awt.Font("COURIER", java.awt.Font.BOLD, 100));

        String fileName = args[0];

        try (Scanner in = new Scanner(new File(fileName))){
            while(in.hasNext()){
                String word = in.next();

                // this places the text in the center of the screen
                // however, it is not displayed until StdDraw.show() is called
                StdDraw.text(50, 50, String.valueOf(word));
                // this displays the text
                StdDraw.show();

                // this causes the program to wait for 500ms, which is 0.5 seconds
                StdDraw.pause(500);

                // this removes everything that is being displayed
                StdDraw.clear();

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
