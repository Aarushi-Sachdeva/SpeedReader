/**
 * Program to implement RSVP speed reader using StdDraw library
 * 
 * @author Chris Murphy
 */
import java.io.*;
import java.util.*;
public class SpeedReader {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please specify the file name and wpm");
            return;
        }

        String fileName = args[0];
        int wordPerMin = Integer.parseInt(args[1]);
        if (wordPerMin <= 0){
            System.out.println("Please specify a positive wpm");
            return;
        }
        int wordsPerSec = wordPerMin / 60;
        int delayTime = 1000/wordsPerSec;

        try (Scanner in = new Scanner(new File(fileName))){
            StdDraw.setCanvasSize(800, 400);
            StdDraw.setXscale(0, 100);
            StdDraw.setYscale(0, 100);

            // this enables animation so that things don't appear jittery
            StdDraw.enableDoubleBuffering();

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.setFont(new java.awt.Font("COURIER", java.awt.Font.BOLD, 100));

            while(in.hasNext()){
                String word = in.next();
                int wordLen = word.length();

                if (wordLen % 2 == 1) {
                    String centerLetter = Character.toString(word.charAt(wordLen/2));

                    // this places the text in the center of the screen
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.text(50, 50, word);
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.text(50, 50, centerLetter);
                    // this displays the text
                    StdDraw.show();
                }
                else{
                    String centerLetter = Character.toString(word.charAt(wordLen/2));
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.text(50-3.25, 50, word);
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.text(50, 50, centerLetter);
                    StdDraw.show();
                }
                // this causes the program to wait for 500ms, which is 0.5 seconds
                StdDraw.pause(delayTime);

                // this removes everything that is being displayed
                StdDraw.clear();

            }
        }
        catch (Exception e) {
            System.out.println("Error reading file");
        }

    }
    
}
