package com.wolf.sort;

/**
 * Created by wolf on 16/3/20.
 *
 * 快速排序:
 * 基本思想:
 *      通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
 *      然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 */
public class Quicksort {

    public static void quickSortDo(int[] arr, int left, int right) {
        if (left < right) {
            int i = left, j = right, x = arr[left];
            while (i < j) {
                //从右到左查找第一个小于x的数
                while (i < j && arr[j] >= x)
                    j--;
                if(i < j)
                    arr[i++] = arr[j];

                //从左到右查找第一个大于x的数
                while (i < j && arr[i] < x)
                    i++;
                if(i < j)
                    arr[j--] = arr[i];

            }
            arr[i] = x;
            quickSortDo(arr, left, i - 1);
            quickSortDo(arr, i + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.println("before sort arr values :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        quickSortDo(arr, 0, 9);
        System.out.println();
        System.out.println("after sort arr values :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
