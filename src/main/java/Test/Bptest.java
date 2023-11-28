package Test;



import java.util.ArrayList;
import java.util.List;

public class Bptest extends Measurement {

    private String syspre;
    private String diapre;

    private String measurement;
    public Bptest(String syspre,String diapre,String measurement,int y, int m, int d){
        super(y,m,d);
        this.syspre=syspre;
        this.diapre=diapre;

        this.measurement=measurement;


    }





    public String getMeasurement() {
        return measurement;
    }




    public List<String> getInfo(){
        ArrayList<String > data = new ArrayList<String>();
        String giver;
        data.add(syspre);
        data.add(diapre);
        data.add(measurement);
        data.add(ld.toString());


        return data;
    }



}
