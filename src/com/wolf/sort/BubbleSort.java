package com.wolf.sort;

import org.junit.Test;

/**
 * Created by wolf on 16/3/14.
 *
 * 冒泡排序
 *      相近的两两比较
 *      基本思想是：每一次将最具有特征的一个数（或者object)放到序列的最前面，或者最后面
 */
public class BubbleSort {

    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    @Test
    public void testBubble(){
        int[] arr = {3,7,5,1,6,8,2};
        bubbleSort(arr);
    }

}
