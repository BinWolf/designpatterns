package com.wolf.sort;

import org.junit.Test;

/**
 * Created by wolf on 16/3/15.
 *
 * 选择排序
 * 每一趟从待排序的数据元素中选出最小（或最大）的一个元素，
 * 顺序放在已排好序的数列的最后，直到全部待排序的数据元素排完。
 */
public class SelectSort {

    public void selectSort(int [] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int min = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            if(i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    @Test
    public void testSelectSort(){
        int[] arr = {3,7,5,1,6,8,2};
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
    }
}
