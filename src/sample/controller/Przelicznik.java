package sample.controller;

/**
 * Created by agaped on 17.12.2017.
 */
public class Przelicznik {

    public double przeliczCF(double temp) {
        return 9.0 / 5.0 * temp + 32.0;
    }

    public double przeliczFC(double temp) {
        return 5.0 / 9.0 * (temp - 32.0);
    }

    public double przeliczCK(double temp) {
        return temp + 273.15;
    }

    public double przeliczKC(double temp) {
        return temp - 273.15;
    }

}