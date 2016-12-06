package ru.vetalshev.chapter4.computer.data;

import ru.vetalshev.chapter4.computer.components.Processor;

import java.util.ArrayList;
import java.util.List;

// implement interface ComputerComponentData for all possible components ???
public class ProcessorData {

    private List<Processor> processorList = new ArrayList<>();

    public ProcessorData() {
        createList();
    }

    public List<Processor> getProcessorList() {
        return processorList;
    }

    private void createList() {
        addItem(1, "intel i7 6700k 4.0GHz", "Intel", 2520, "8Mb", 8);
        addItem(2, "intel i7 4790k 4.4GHz", "Intel", 1900, "6Mb", 8);
        addItem(3, "amd fx 8350", "AMD", 1820, "12Mb", 8);
        addItem(4, "intel i5 6600k 3.9GHz", "Intel", 1280, "8Mb", 6);
        addItem(5, "intel i5 4690k 3.5GHz", "Intel", 980, "6Mb", 4);
    }

    private void addItem(int id, String name, String manufacturer, float price, String cache, int coreNumber) {
        Processor processor = new Processor(id, name, manufacturer, price, cache, coreNumber);
        processorList.add(processor);
    }

}
