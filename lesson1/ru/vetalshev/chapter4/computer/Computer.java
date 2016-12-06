package ru.vetalshev.chapter4.computer;

import ru.vetalshev.chapter4.computer.components.CdRom;
import ru.vetalshev.chapter4.computer.components.Hdd;
import ru.vetalshev.chapter4.computer.components.Processor;
import ru.vetalshev.chapter4.computer.components.Ram;

public class Computer {

    private CdRom cdRom;
    private Hdd hdd;
    private Processor processor;
    private Ram ram;

    // Нужно ли хранить цену всего компьютера или вычеслять ее постоянно???

    public Computer() {
    }

    public Computer(CdRom cdRom, Hdd hdd, Processor processor, Ram ram) {
        this.cdRom = cdRom;
        this.hdd = hdd;
        this.processor = processor;
        this.ram = ram;
    }

    public void addProcessor(Processor processor) {
        this.processor = processor;
    }

    public void addCdRom(CdRom cdRom) {
        this.cdRom = cdRom;
    }

    public void addRam(Ram ram) {
        this.ram = ram;
    }

    public void addHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public float getTotalPrice() {
        float totalPrice = 0;

        totalPrice += cdRom.getPrice() + hdd.getPrice() + processor.getPrice() + ram.getPrice();

        return totalPrice;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cdRom=" + cdRom +
                ",\n\r hdd=" + hdd +
                ",\n\r processor=" + processor +
                ",\n\r ram=" + ram +
                '}';
    }
}
