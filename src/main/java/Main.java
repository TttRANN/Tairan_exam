import Test.Bptest;
import Test.*;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        Patient pat1 = new Patient("Daphne Von Oram",62,true,true,"https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        Mriscan mriscan1 = new Mriscan("https://martinh.netfirms.com/BIOE60010/mri1.jpg","2");
//        Bptest bptest1 = new Bptest("130","70","ST");




        Patient pat2 = new Patient("Sebastian Compton", 31,true,true,"https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");
        Mriscan mriscan2 = new Mriscan("https://martinh.netfirms.com/BIOE60010/mri2.jpg","4");
        Bptest bptest2 = new Bptest("150","80","VST");




        JFrame frame = new JFrame("Stroke investigation system");
        frame.setSize(500,500);

        JPanel displayPanel = new JPanel();
        // Create a label for each patient's text
        JLabel displayLabel1 = new JLabel(pat1.getInforDisplay(new Bptest("130","70","ST")));
//        JLabel displayLabel2 = new JLabel("v");

        displayPanel.add(displayLabel1);
//        JLabel label = new JLabel();
        URL imageURL=null;

        try {
            imageURL = new URL("https://martinh.netfirms.com/b3ta/kennyg.jpg");

        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);


        displayLabel1.setIcon(thisImageIcon);







//        displayPanel.add(displayLabel2);
        frame.setContentPane(displayPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });


        System.out.println(pat2.getInforAdmin(bptest2,mriscan2));





    }
}
