package ru.vetalshev.collections.set;

public class IntegerWrapper implements Comparable<IntegerWrapper> {

    private int value;

    public IntegerWrapper(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(IntegerWrapper anotherNumber) {
//        return Integer.compare(anotherNumber.getValue(), this.value);
        return Integer.compare(this.value, anotherNumber.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntegerWrapper that = (IntegerWrapper) o;

        return value == that.value;

    }

    @Override
    public String toString() {
        return "IntegerWrapper{" +
                "value=" + value +
                '}';
    }

    @Override
    public int hashCode() {
        return value;
    }

}
