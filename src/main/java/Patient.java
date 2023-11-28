import Test.Bptest;
import Test.*;

import javax.swing.*;


import java.net.URL;


public class Patient {
    private final String name;
    private String urlname;
    private int age;
    private boolean mri;
    private boolean bp;




    public Patient(String name,int age,boolean mri, boolean bp, String urlname) {
        this.name = name;
        this.age=age;
        this.urlname=urlname;

        this.mri=mri;
        this.bp=bp;


    }

    public String getName() {
        return name;
    }

    public String getUrlname() {
        return urlname;
    }

    public int getAge() {
        return age;
    }




    public String getInforAdmin(Bptest bptest, Mriscan mriscan){
        String result = "";
        result += "Patient: "+name+":";
        result+=" MRI: "+mriscan.getTesla()+" Tesla, ";
        result+=mriscan.getInfo().get(2)+": ";
        result+="BP "+ bptest.getMeasurement()+bptest.getInfo().get(3);
        return result;

    }




    public static void showPatientInformation(Patient patient, Bptest bptest, Mriscan mriscan) {

        JFrame frame = new JFrame("Patient Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel mainPanel = new JPanel();



        JLabel nameLabel1 = new JLabel("Name: " + patient.getName());
        JLabel ageLabel1 = new JLabel("Age: " + patient.getAge());


        JLabel nameLabel = new JLabel();
        try {
            URL imageUrl = new URL(patient.getUrlname());
            ImageIcon imageIcon = new ImageIcon(imageUrl);
            nameLabel.setIcon(imageIcon);
        } catch (Exception e) {
            e.printStackTrace();
            nameLabel.setText("Image not found");
        }

        JLabel label = new JLabel();
        try {
            URL imageUrl2 = new URL(mriscan.getUrlmri());
            ImageIcon imageIcon = new ImageIcon(imageUrl2);
            label.setIcon(imageIcon);
        } catch (Exception e) {
            e.printStackTrace();
            label.setText("Image not found");
        }


        JLabel bloodPressureLabel = new JLabel("<html>Blood pressure<br>" + bptest.getInfo().get(0) + " over " + bptest.getInfo().get(1) + "</html>");

        mainPanel.add(nameLabel);

        mainPanel.add(nameLabel1);
        mainPanel.add(ageLabel1);
        mainPanel.add(label);


        mainPanel.add(bloodPressureLabel);


        frame.add(mainPanel);

        frame.pack();




        frame.setVisible(true);
    }
}





