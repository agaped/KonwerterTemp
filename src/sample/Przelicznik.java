package sample;

/**
 * Created by agaped on 17.12.2017.
 */
public class Przelicznik {

    public double przeliczCC(double temp) {
        return temp = temp;
    }
    public double przeliczFF(double temp) {
        return temp = temp;
    }
    public double przeliczKK(double temp) {
        return temp = temp;
    }

    public double przeliczCF(double temp) {
        return temp = 9.0 / 5.0 * temp + 32.0;
    }

    public double przeliczFC(double temp) {
        return temp = 5.0 / 9.0 * temp - 32.0;
    }

    public double przeliczCK(double temp) {
        return temp = temp - 273.15;
    }

    public double przeliczKC(double temp) {
        return temp = temp + 273.15;
    }

    public double przeliczFK(double temp) {
        return temp = (temp + 459.67) * 5.0 / 9.0;
    }

    public double przeliczKF(double temp) {
        return temp = (temp - 459.67) * 9.0 / 5.0;
    }

}