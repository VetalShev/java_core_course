package ru.vetalshev.chapter4.computer.validators;

import ru.vetalshev.chapter4.computer.components.CdRom;

public class CdRomValidator extends ConstraintValidatorImpl {

    @Override
    public boolean isValid(Object obj) {
        CdRom cdRom = (CdRom) obj;

        return validateCode(cdRom.getCode()) &&
                validateManufacturer(cdRom.getManufacturer()) &&
                validatePrice(cdRom.getPrice());
    }
}
