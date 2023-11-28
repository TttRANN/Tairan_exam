package Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mriscan extends Measurement {
    private  String urlmri;
    private String tesla;
    public Mriscan(String urlmri, String tesla){
        super();
        this.urlmri=urlmri;
        this.tesla=tesla;

    }

    public String getTesla() {
        return tesla;
    }

    public String getUrlmri() {
        return urlmri;
    }
    public LocalDate getCurrentDate() {
        return currentDate;
    }


    public List<String> getInfo(){
        ArrayList<String > data = new ArrayList<String>();

        data.add(urlmri);
        data.add(tesla);

        data.add(currentDate.toString());


        return data;
    }
}
