package ru.vetalshev.chapter4.computer;

import ru.vetalshev.chapter4.computer.components.CdRom;
import ru.vetalshev.chapter4.computer.components.Hdd;
import ru.vetalshev.chapter4.computer.components.Processor;
import ru.vetalshev.chapter4.computer.components.Ram;

import ru.vetalshev.chapter4.computer.data.CdRomData;
import ru.vetalshev.chapter4.computer.data.HddData;
import ru.vetalshev.chapter4.computer.data.ProcessorData;
import ru.vetalshev.chapter4.computer.data.RamData;

import java.util.ArrayList;
import java.util.List;

// TODO (vetalshev): create universal dataProvider API like getFullList(), getItemById() etc..
public class DataProvider {

    private CdRomData cdRomData = new CdRomData();
    private ProcessorData processorData = new ProcessorData();
    private HddData hddData = new HddData();
    private RamData ramData = new RamData();

    public List<Hdd> getHddList() {
        return hddData.getHddList();
    }

    public List<Processor> getProcessorList() {
        return processorData.getProcessorList();
    }

    public List<Ram> getRamList() {
        return ramData.getRamList();
    }

    public List<CdRom> getCdRomList() {
        return cdRomData.getCdRomList();
    }

    public CdRom getCdRomById(int id) {
        List<CdRom> list = cdRomData.getCdRomList(); // нужно ли внутри класса обращаться к его пропертям через геттер или можно напрямую ???
        CdRom foundProduct = new CdRom();

        for (CdRom item : list) {

            if (item.getId() == id) {
                foundProduct = item;
                break;
            }
        }

        if (foundProduct == null) { // к какому значению приривнивать ???
            throw new IllegalArgumentException("Product with ID=" + id + " not found");
        }

        return foundProduct;
    }

    public Processor getProcessorById(int id) {
        List<Processor> list = processorData.getProcessorList();
        Processor foundProduct = new Processor();

        for (Processor item : list) {

            if (item.getId() == id) {
                foundProduct = item;
                break;
            }
        }

        if (foundProduct == null) {
            throw new IllegalArgumentException("Product with ID=" + id + " not found");
        }

        return foundProduct;
    }

    public Hdd getHddById(int id) {
        List<Hdd> list = hddData.getHddList();
        Hdd foundProduct = new Hdd();

        for (Hdd item : list) {

            if (item.getId() == id) {
                foundProduct = item;
                break;
            }
        }

        if (foundProduct == null) {
            throw new IllegalArgumentException("Product with ID=" + id + " not found");
        }

        return foundProduct;
    }

    public Ram getRamById(int id) {
        List<Ram> list = ramData.getRamList();
        Ram foundProduct = new Ram();

        for (Ram item : list) {

            if (item.getId() == id) {
                foundProduct = item;
                break;
            }
        }

        if (foundProduct == null) {
            throw new IllegalArgumentException("Product with ID=" + id + " not found");
        }

        return foundProduct;
    }

}
