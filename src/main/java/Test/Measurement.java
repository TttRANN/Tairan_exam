package Test;

import java.time.LocalDate;

public class Measurement {
    protected LocalDate ld;

    public Measurement(int y, int m, int d) {
        this.ld = LocalDate.parse(LocalDate.of(y,m,d).toString());
    }

}
