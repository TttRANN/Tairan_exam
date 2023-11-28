package Test;

import java.time.LocalDate;

public class Measurement {
    protected LocalDate currentDate;

    public Measurement() {
        this.currentDate = LocalDate.now();
    }

}
