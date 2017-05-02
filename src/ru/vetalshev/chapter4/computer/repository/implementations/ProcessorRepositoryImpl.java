package ru.vetalshev.chapter4.computer.repository.implementations;

import ru.vetalshev.chapter4.computer.components.Processor;
import ru.vetalshev.chapter4.computer.repository.interfaces.ProcessorRepository;

// implement interface ComputerComponentData for all possible components ??? [RESOLVED]
public class ProcessorRepositoryImpl extends ProductRepositoryImpl<Processor> implements ProcessorRepository {

    public String getContentType() {
        return "Processor";
    }

}
