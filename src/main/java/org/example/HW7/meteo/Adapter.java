package org.example.meteo;

import java.time.LocalDateTime;

public class Adapter implements MeteoSensor{
    int id;
    SensorTemperature st;

    public Adapter(SensorTemperature st) {
        this.st = st;
        this.id = st.identifier();
    }



    @Override
    public int getId() {
        return id;
    }

    @Override
    public Float getTemperature() {
        return (float) st.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
