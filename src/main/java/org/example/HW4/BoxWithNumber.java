package org.example.HW4;

public class BoxWithNumber<T extends Number> {
    private T[] item;

    public BoxWithNumber(T... item) {
        this.item = item;
    }

    public T[] getItem() {
        return item;
    }

    public void setItem(T[] item) {
        this.item = item;
    }

    public double average(){
        double sum = 0;
        for (T t: item) {
            sum += t.doubleValue();
        }
        return sum/ item.length;
    }

    public boolean compareAverage(BoxWithNumber<?> anotherItems) {
        return Math.abs(this.average() - anotherItems.average()) < 0.001;
    }
}
