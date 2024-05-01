package task1;

public class TemperatureConverter {

    public double convertToFahrenheit(double celsiusTemperature) {
        double coefficient = 9.0 / 5.0;
        double addition = 32.0;

        double fahrenheitTemperature = (celsiusTemperature * coefficient) + addition;

        return fahrenheitTemperature;
    }

}

