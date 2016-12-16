package ru.vetalshev.chapter4.computer.components;

//@Constraint (validatedBy = ProcessorValidator.class)
public class Processor extends Product {

    private String cache;
    private int coresNumber;

    public Processor() {
    }

    public Processor(String code) {
        super(code);
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public int getCoresNumber() {
        return coresNumber;
    }

    public void setCoresNumber(int coresNumber) {
        this.coresNumber = coresNumber;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "cache='" + cache + '\'' +
                ", coresNumber=" + coresNumber +
                "} " + super.toString();
    }
}
