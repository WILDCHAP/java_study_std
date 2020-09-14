package com.wildchap.array;
/**
 * 
 * @author wang	993704315@qq.com
 *
 *
 */
public class ArrayTest {
	public static void main(String[] args) {
		int[] ids;
		/*静态初始化*/
		ids = new int[] {100, 101, 102};
		/*动态初始化*/	
		String[] names = new String[5];
		
		/*二维数组*/
		int[][] arr1 = new int[][] {{1, 2}, {3, 4}, {5, 6}};
		String[][] arr2 = new String[3][];
		
		arr2[1] = new String[3];
		System.out.println(arr2[1][1]);
		
		
	}
}
