package ru.vetalshev.chapter4.computer.validators;

import ru.vetalshev.chapter4.computer.components.Ram;

public class RamValidator extends ConstraintValidatorImpl {

    @Override
    public boolean isValid(Object obj) {
        Ram ram = (Ram) obj;

        return validateCode(ram.getCode()) &&
                validateManufacturer(ram.getManufacturer()) &&
                validatePrice(ram.getPrice());

    }
}
