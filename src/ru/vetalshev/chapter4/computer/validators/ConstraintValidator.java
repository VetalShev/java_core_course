package ru.vetalshev.chapter4.computer.validators;

public interface ConstraintValidator {

    boolean isValid(Object obj);
    boolean validateCode(String code);
    boolean validateManufacturer(String manufacturer);
    boolean validatePrice(double price);
}
