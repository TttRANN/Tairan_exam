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
        Mriscan mriscan1 = new Mriscan("https://martinh.netfirms.com/BIOE60010/mri1.jpg","2",2023,9,14);
        Bptest bptest1 = new Bptest("130","70","ST",2023,9,15);




        Patient pat2 = new Patient("Sebastian Compton", 31,true,true,"https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");
        Mriscan mriscan2 = new Mriscan("https://martinh.netfirms.com/BIOE60010/mri2.jpg","4",2023,11,19);
        Bptest bptest2 = new Bptest("150","80","VST",2023,11,20);


        System.out.println(pat2.getInforAdmin(bptest2,mriscan2));
        System.out.println(pat1.getInforAdmin(bptest1,mriscan1));
        pat2.showPatientInformation(pat2, bptest2, mriscan2);
        pat1.showPatientInformation(pat1, bptest1, mriscan1);






    }
}
