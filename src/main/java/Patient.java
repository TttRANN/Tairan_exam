import Test.Bptest;
import Test.*;

import java.util.ArrayList;

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

    public boolean isMri() {
        return mri;
    }

    public boolean isBp() {
        return bp;
    }

    public void setUrl(String urlname) {
        this.urlname = urlname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMri(boolean mri) {
        this.mri = mri;
    }

    public void setBp(boolean bp) {
        this.bp = bp;
    }

    public String getInforDisplay(Bptest bptest){




        String display=new String("<html>");
        display+="Name:"+name+"<br>";

        display+="Age:"+age+"<br>";



        String display2=new String("<html>");
        display2+="Blood pressure"+ bptest.getInfo().get(0)+" over "+bptest.getInfo().get(1);

        return display+"<br>"+display2+"<br></html>";




    }

    public String getInforAdmin(Bptest bptest, Mriscan mriscan){
        String result = "";
        result += "Patient: "+name;
        result+="MRI: "+mriscan.getTesla()+" Tesla,";
        result+=mriscan.getCurrentDate().toString()+":";
        result+="BP "+ bptest.getMeasurement()+bptest.getCurrentDate().toString();
        return result;











    }



}
