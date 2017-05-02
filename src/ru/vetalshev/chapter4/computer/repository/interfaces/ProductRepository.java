package ru.vetalshev.chapter4.computer.repository.interfaces;

import ru.vetalshev.chapter4.computer.components.Product;

import java.util.List;

public interface ProductRepository<T extends Product> {

    public void addItem(T item);
    public T findByCode(String code);
    public List<String> getCodeList();
    public List<T> getProductList();

}
