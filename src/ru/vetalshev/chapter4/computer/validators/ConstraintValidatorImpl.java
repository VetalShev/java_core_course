package ru.vetalshev.chapter4.computer.validators;

public abstract class ConstraintValidatorImpl implements ConstraintValidator {

    public boolean validateCode(String code) {
        return (code != null);
    }

    public boolean validateManufacturer(String manufacturer) {
        return (manufacturer != null);
    }

    public boolean validatePrice(double price) {
        return (price > 0);
    }

}
