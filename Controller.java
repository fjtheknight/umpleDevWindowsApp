/*

Copyright: All contributers to the Umple Project

This file is made available subject to the open source license found at:
http://umple.org/license

*/

//@author Firas Jribi {@link firas.jribi.tn@gmail.com}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import java.io.File;
public class Controller implements ActionListener {

    private View aFrame;

    public Controller() {

        aFrame = new AppFrame(this) ;
    }


    /**
     * Callback used when the user clicks a button (reset,
     * random or quit)
     *
     * @param e
     *            the ActionEvent
     */

    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Build Umple")) {
            System.out.println("Build Umple");
        try{

            if ((new File(".\\batchFiles\\buildUmple.bat")).exists()) {

                Process p = Runtime
                   .getRuntime()
                   .exec("rundll32 url.dll,FileProtocolHandler .\\batchFiles\\buildUmple.bat");
                p.waitFor();

            } else {

                System.out.println("File does not exist");

            }

          } catch (Exception ex) {
            ex.printStackTrace();
          }
        } else         if(e.getActionCommand().equals("Build Umple Online")) {
            System.out.println("Build Umple Online");
        try{

            if ((new File(".\\batchFiles\\buildUmpleOnline.bat")).exists()) {

                Process p = Runtime
                   .getRuntime()
                   .exec("rundll32 url.dll,FileProtocolHandler .\\batchFiles\\buildUmpleOnline.bat");
                p.waitFor();

            } else {

                System.out.println("File does not exist");

            }

          } catch (Exception ex) {
            ex.printStackTrace();
          }
        } else         if(e.getActionCommand().equals("Build Umple Quick")) {
            System.out.println("Build Umple Quick");
        try{

            if ((new File(".\\batchFiles\\buildUmpleQuick.bat")).exists()) {

                Process p = Runtime
                   .getRuntime()
                   .exec("rundll32 url.dll,FileProtocolHandler .\\batchFiles\\buildUmpleQuick.bat");
                p.waitFor();

            } else {

                System.out.println("File does not exist");

            }

          } catch (Exception ex) {
            ex.printStackTrace();
          }
        } else         if(e.getActionCommand().equals("Run Apache")) {
            System.out.println("Run Apache");
        try{

            if ((new File(".\\batchFiles\\runApache.bat")).exists()) {

                Process p = Runtime
                   .getRuntime()
                   .exec("rundll32 url.dll,FileProtocolHandler .\\batchFiles\\runApache.bat");
                p.waitFor();

            } else {

                System.out.println("File does not exist");

            }

          } catch (Exception ex) {
            ex.printStackTrace();
          }
        } else         if(e.getActionCommand().equals("Build Doc")) {
            System.out.println("Build Doc");
        try{

            if ((new File(".\\batchFiles\\buildDoc.bat")).exists()) {

                Process p = Runtime
                   .getRuntime()
                   .exec("rundll32 url.dll,FileProtocolHandler .\\batchFiles\\buildDoc.bat");
                p.waitFor();

            } else {

                System.out.println("File does not exist");

            }

          } catch (Exception ex) {
            ex.printStackTrace();
          }
        } else         if(e.getActionCommand().equals("Build Umple First")) {
            System.out.println("Build Umple First");
        try{

            if ((new File(".\\batchFiles\\buildUmpleFirst.bat")).exists()) {

                Process p = Runtime
                   .getRuntime()
                   .exec("rundll32 url.dll,FileProtocolHandler .\\batchFiles\\buildUmpleFirst.bat");
                p.waitFor();

            } else {

                System.out.println("File does not exist");

            }

          } catch (Exception ex) {
            ex.printStackTrace();
          }
        } else {

        }
    }

}
