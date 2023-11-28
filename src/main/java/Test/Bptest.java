package Test;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class Bptest extends Measurement {

    private String syspre;
    private String diapre;

    private String measurement;
    public Bptest(String syspre,String diapre,String measurement){
        super();
        this.syspre=syspre;
        this.diapre=diapre;

        this.measurement=measurement;


    }

    public void setDiapre(String diapre) {
        this.diapre = diapre;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public void setSyspre(String syspre) {
        this.syspre = syspre;
    }

    public String getDiapre() {
        return diapre;
    }

    public String getSyspre() {
        return syspre;
    }

    public String getMeasurement() {
        return measurement;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public List<String> getInfo(){
        ArrayList<String > data = new ArrayList<String>();
        String giver;
        data.add(syspre);
        data.add(diapre);
        data.add(measurement);
        data.add(currentDate.toString());


        return data;
    }



}
