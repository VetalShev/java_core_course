package ru.vetalshev.chapter4.computer.components;

import ru.vetalshev.chapter4.computer.annotations.Constraint;
import ru.vetalshev.chapter4.computer.validators.RamValidator;

@Constraint(validatedBy = RamValidator.class)
public class Ram extends Product {

    private int volume;
    private int frequency;
    private float voltage;
    private String type;
    private String formFactor;

    public Ram() {
    }

    public Ram(String code) {
        super(code);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "volume=" + volume +
                ", frequency=" + frequency +
                ", voltage=" + voltage +
                ", type='" + type + '\'' +
                ", formFactor='" + formFactor + '\'' +
                "} " + super.toString();
    }
}
