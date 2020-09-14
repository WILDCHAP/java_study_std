package com.wildchap.array;

import java.util.Arrays;

/**
 * 
 * @author wang	993704315@qq.com
 *
 *
 */
public class SimpleSort {
	public void quicksort(int[] a, int beg, int end) {
		if(beg<end) {
			a[0] = a[beg];
			int i=beg, j=end;
			//System.out.print(i + " " + j + a[0] + a[7]);
			while(i<j) {
				while(a[j]<a[0] && i<j) {
					j--;
				}
				if(i<j)
					a[i] = a[j];
				while(a[i]>a[0] && i<j) {
					i++;
				}
				if(i<j)
					a[j] = a[i];
				
			}
			a[i] = a[0];
			quicksort(a, beg, i-1);
			quicksort(a, i+1, end);
		}
	}
	public void bubsort(int[] a) {
		int len = a.length;
		for(int i=len-1; i>1; i--) {		//冒泡到a[i]位置
			for(int j=1; j<i; j++) {
				if(a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public void choicesort(int[] a) {
		int len = a.length;
		int max=1;
		for(int i=1; i<len; i++) {
			max = i;
			for(int j=i+1; j<len; j++)
				if(a[max] < a[j])
					max = j;
			if(i != max) {
				int temp = a[max];
				a[max] = a[i];
				a[i] = temp;
			}
		}
	}
	/**
	  * 调整beg下属树的大顶堆
	 * wang
	 */
	public void heapSort(int[] a, int beg, int end) {
		if(beg<end) {
			/*i从第一个子节点的开始*/
			int i = beg * 2;
			if(i == 0)	i = 1;
			/*暂存该点值*/
			int key = a[beg];
			while(i <= end) {	//只要没到末尾就继续
				if((i+1) <= end && a[i] < a[i+1])		//取a[i]和a[i+1]中大的那个
					i++;
				if(a[i] > key) {//如果子节点值比该值大的话
					a[beg] = a[i];
					beg = i;
					i = i * 2 + 1;
				}else			//它的子节点都没问题，那就不需要更改了
					break;
			}
			a[beg] = key;
		}
	}
	/**
	  * 完整堆排序代码
	 * wang
	 */
	public void heapSortFinal(int[] a) {
		int len = a.length;
		SimpleSort ss = new SimpleSort();
		/*初始化建立大顶堆(从第一个子节点开始)*/
		for(int i=(len-1)/2; i>=0; i--) {
			ss.heapSort(a, i, len-1);
			//System.out.println(i + " " + Arrays.toString(a));
		}
		for(int i=len-1; i>0; i--) {
			/*每次把堆顶放到a[i]*/
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			System.out.println(i + " " + Arrays.toString(a));
			ss.heapSort(a, 0, i-1);
		}
	}
	public static void main(String[] args) {
		int[] a = new int[] {0, 5, 8, 6, 2, 1, 9, 7};
		System.out.println("Before sort:" + Arrays.toString(a));
		SimpleSort ss = new SimpleSort();
		ss.heapSortFinal(a);
		System.out.println("After sort:" + Arrays.toString(a));
	}
}
