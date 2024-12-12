package com.collection;

public class Generic {

    public static <E> void printArray(E[] inputArray) {
        for (E e : inputArray) {
            System.out.print(e + " : ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer intArray[] = {1, 2, 3, 4, 5};
        Double doubleArray[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character charArray[] = {'T', 'O', 'P', 'S'};
        String strArray[] = {"java", "python", "Automation", "PHP", "Android"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
        printArray(strArray);
    }
}
