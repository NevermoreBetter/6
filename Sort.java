package com.company;

public class Sort {

    private int array[];
    private int len;
    private int last = 0;

    public Sort(int lenght) {
        len = lenght;
        array = new int[len];
    }

    public void add(int newElement) {
        if (last < len - 1) {
            array[last] = newElement;
            last++;
        } else
            System.out.println("Список переполнен!");
    }

    public void view() {
        System.out.print("\nВ массиве " + (last + 1) + " элементов. Элементы массива:\n ");
        for (int i = 0; i < last + 1; i++)
            System.out.print(array[i] + " ");
    }


    public void InsertionSort() {
        long startTime = -System.nanoTime();
        int left = 0; // левая граница
        int right = last;
        for (int i = 1; i < last; i++) {
            int element = array[i];
            int j = i - 1;
            while (j >= 0 && (array[j + 1] > array[j])) {
                array[j] = array[j + 1];
                j--;
            }
            array[j + 1] = element;
        }
        System.out.println("Сортировка завершена! Затрачено:" + (startTime + System.nanoTime()) + "ns");
    }

    public void zapolnit() {
        for (int i = 1; i < len; i++)
            add((int) (Math.random() * len));
    }
}