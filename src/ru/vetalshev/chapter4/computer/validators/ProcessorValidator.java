package ru.vetalshev.chapter4.computer.validators;

import ru.vetalshev.chapter4.computer.components.Processor;

public class ProcessorValidator extends ConstraintValidatorImpl {

    @Override
    public boolean isValid(Object obj) {
        Processor processor = (Processor) obj;

        return validateCode(processor.getCode()) &&
                validateManufacturer(processor.getManufacturer()) &&
                validatePrice(processor.getPrice());
    }

}
