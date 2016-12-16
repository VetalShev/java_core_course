package ru.vetalshev.chapter4.computer.repository.implementations;

import ru.vetalshev.chapter4.computer.components.Product;
import ru.vetalshev.chapter4.computer.repository.interfaces.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductRepositoryImpl<T extends Product> implements ProductRepository<T> {

    private List<T> productList = new ArrayList<>();

    @Override
    public void addItem(T item) {
        productList.add(item);
    }

    @Override
    public List<String> getCodeList() {
        List<String> codeList = new ArrayList<>();

        for (int i = 0, len = productList.size(); i < len; i++) {
            codeList.add(productList.get(i).getCode());
        }

        return codeList;
    }

    public List<T> getProductList() {
        return productList;
    }

    @Override
    public T findByCode(String code) {
        for (int i = 0, len = productList.size(); i < len; i++) {
            T item = productList.get(i);

            if (item.getCode().startsWith(code)) {
                return item;
            }
        }

        return null;
    }

}