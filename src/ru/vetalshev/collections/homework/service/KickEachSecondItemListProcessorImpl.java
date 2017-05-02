package ru.vetalshev.collections.homework.service;

import java.util.Iterator;
import java.util.List;

public class KickEachSecondItemListProcessorImpl<T> implements ListProcessor<T> {

    private boolean printStepToStepResults = true;

    public KickEachSecondItemListProcessorImpl() {
    }

    public KickEachSecondItemListProcessorImpl(boolean printStepToStepResults) {
        this.printStepToStepResults = printStepToStepResults;
    }

    public void start(List<T> list) {

        boolean isRemoved = true;

        while (true) {
            isRemoved = removeEven(list, isRemoved);

            if (list.size() < 2) {
                break;
            }
        }

    }

    private boolean removeEven(List<T> list, boolean isRemoved) {
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

        return isRemoved;
    }

    public boolean isPrintStepToStepResults() {
        return printStepToStepResults;
    }

    public void setPrintStepToStepResults(boolean printStepToStepResults) {
        this.printStepToStepResults = printStepToStepResults;
    }
}
