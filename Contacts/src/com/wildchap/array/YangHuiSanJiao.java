package com.wildchap.array;
/**
 * 
 * @author wang	993704315@qq.com
 *
 *
 */
public class YangHuiSanJiao {
	public static void main(String[] args) {
		/*打印杨辉三角*/
		int[][] yhsj = new int[10][];
		for(int i=0; i<yhsj.length; i++) {
			yhsj[i] = new int[i+1];
			yhsj[i][0] = yhsj[i][i] = 1;
			for(int j=1; j<i; j++) {
				yhsj[i][j] = yhsj[i-1][j-1] + yhsj[i-1][j];
			}
			//System.out.print(yhsj[i][0] + "  ");
		}
		for(int i=0;i<yhsj.length; i++) {
			for(int j=0; j<=i; j++)
				System.out.print(yhsj[i][j] + "  ");
			System.out.println('\n');
		}
	}
}
