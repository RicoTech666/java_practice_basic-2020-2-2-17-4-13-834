package com.thoughtworks;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};

        int[] insertedArr = new int[array.length + 1];

        if (number < array[0]) {
            insertedArr[0] = number;
            for (int i = 1; i < insertedArr.length; i++) {
                insertedArr[i] = array[i - 1];
            }
        } else if (number > array[array.length - 1]) {
            insertedArr[insertedArr.length - 1] = number;
            for (int i = 0; i < array.length; i++) {
                insertedArr[i] = array[i];
            }
        } else {
            insertedArr[0] = array[0];
            insertedArr[insertedArr.length - 1] = array[array.length - 1];
            boolean hasInserted = false;
            for (int i = 1; i < array.length; i++) {
                if (number < array[i] && number > array[i - 1]) {
                    insertedArr[i] = number;
                    hasInserted = true;

                } else if (!hasInserted) {
                    insertedArr[i] = array[i];
                } else {
                    insertedArr[i] = array[i - 1];
                }
            }
        }
        return insertedArr;
    }
}
