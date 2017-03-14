package ru.vetalshev.collections.homework.service;

import java.util.Iterator;
import java.util.List;

public class RemoveEvenCircleService<T> {

    private List<T> list;
    private boolean isRemoved = true;
    private boolean printStepToStepResults = true;

    public RemoveEvenCircleService(List<T> list) {
        this.list = list;
    }

    public RemoveEvenCircleService(List<T> list, boolean printStepToStepResults) {
        this.list = list;
        this.printStepToStepResults = printStepToStepResults;
    }

    public List<T> start() {

        while (true) {
            removeEven();

            if (list.size() < 2) {
                break;
            }
        }

        return list;
    }

    public void removeEven() {
        Iterator<T> it = list.iterator();

        while (it.hasNext()) {
            it.next();
            if (isRemoved) {
                isRemoved = false;
            } else {
                isRemoved = true;
                it.remove();
            }
        }

        if (printStepToStepResults) {
            System.out.println(list);
        }
    }

    public boolean isPrintStepToStepResults() {
        return printStepToStepResults;
    }

    public void setPrintStepToStepResults(boolean printStepToStepResults) {
        this.printStepToStepResults = printStepToStepResults;
    }
}
