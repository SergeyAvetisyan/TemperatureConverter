package com.temperatureconverter.api;

public enum Temperature {
    Celcius,
    Reamur,
    Fahrenheit,
    Kelvin;

    public double convert(double value, Temperature to) {
        if (this == Celcius) {
            switch (to) {
                case Reamur:
                    return (4.0/5.0) * value;

                case Fahrenheit:
                    return ((9.0/5.0) * value) + 32;

                case Kelvin:
                    return value + 273;

                default:
                    break;
            }
        } else if (to == Celcius) {
            switch (this) {
                case Reamur:
                    return (5.0/4.0) * value;

                case Fahrenheit:
                    return (value - 32) * (5.0/9.0);

                case Kelvin:
                    return value - 273;

                default:
                    break;
            }
        } else {
            double celcius = convert(value, Celcius);
            return Celcius.convert(celcius, to);
        }

        return value;
    }
}