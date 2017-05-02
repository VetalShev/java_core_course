package ru.vetalshev.collections.arrayList;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item> {

    private ItemEnum sortingIndex;
    private boolean ascend;

    public void setAscend(boolean ascend) {
        this.ascend = ascend;
    }

    public boolean getAscend() {
        return ascend;
    }


    public ItemComparator(ItemEnum sortingIndex, boolean ascend) {
        setSortingIndex(sortingIndex);
        this.ascend = ascend;
    }

    public final void setSortingIndex(ItemEnum sortingIndex) {
        if (sortingIndex == null) {
            throw new IllegalArgumentException();
        }
        this.sortingIndex = sortingIndex;
    }

    public ItemEnum getSortingIndex() {
        return sortingIndex;
    }

    @Override
    public int compare(Item one, Item two) {
        switch (sortingIndex) {
            case ITEM_ID:

                return getAscend()
                        ? one.getItemId() - two.getItemId()
                        : two.getItemId() - one.getItemId();

            case PRICE:
                if (getAscend()) {
                    return Double.compare(one.getPrice(), two.getPrice());
                } else {
                    return Double.compare(two.getPrice(), one.getPrice());
                }
            case NAME:
                if (getAscend()) {
                    return one.getName().compareTo(two.getName());
                } else {
                    return two.getName().compareTo(one.getName());
                }
            default:
                throw new EnumConstantNotPresentException(ItemEnum.class, sortingIndex.name());
        }
    }

}
