package ru.vetalshev.collections.stack;

import java.util.ArrayList;
import java.util.List;

public class Test<T> {

    private List<T> testList = new ArrayList<>();

    public void start() {

    }

    public void add(T test) {
        testList.add(test);
    }

    public List<T> getTestList() {
        return testList;
    }
}
