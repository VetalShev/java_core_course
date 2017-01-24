package ru.vetalshev.chapter4.computer.validators;

import ru.vetalshev.chapter4.computer.components.Hdd;

public class HddValidator extends ConstraintValidatorImpl {

    @Override
    public boolean isValid(Object obj) {
        Hdd hdd = (Hdd) obj;

        return validateCode(hdd.getCode()) &&
                validateManufacturer(hdd.getManufacturer()) &&
                validatePrice(hdd.getPrice());
    }

}