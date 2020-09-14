package com.wildchap.arrays;
import java.util.Arrays;

import com.wildchap.array.SimpleSort;
/**
 * 
 * @author wang	993704315@qq.com
 *
 *
 */

public class ArraysTest {
	public static void main(String[] args) {
		/*equals*/
		int[] arr1 = new int[] {1, 2, 3, 4};
		int[] arr2 = new int[] {5, 2, 9, 8};
		boolean tag = Arrays.equals(arr1, arr2);
		System.out.println(tag);
		/*用一个数字填充数组*/
		Arrays.fill(arr1, 10);
		/*toString输出数组信息*/
		System.out.println(Arrays.toString(arr1));
		/*sort排序*/
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		/*binarySearch二分查找*/
		int k = Arrays.binarySearch(arr2, 2);
		System.out.println(k);
		SimpleSort ss = new SimpleSort();
		ss.bubsort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
