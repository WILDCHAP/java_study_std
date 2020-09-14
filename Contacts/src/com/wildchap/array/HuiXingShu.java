package com.wildchap.array;
import java.util.Scanner;
/**
 * 
 * @author wang	993704315@qq.com
 *
 *
 */

public class HuiXingShu {
	public static void main(String[] args) {
		/*回形数*/
		/*依次右下左上*/
		int[][] way = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入回形数：");
		int n = scan.nextInt();
		int[][] hxs = new int[n + 1][n + 1];	//20*20之内
		
		/*赋值*/
		int num = 1;
		int row=1, col=1;
		int k = 0;
		while(num <= n*n) {
			if(hxs[row][col] == 0) {		//如果当前位置还未填数
				hxs[row][col] = num;
				//System.out.println("(" + row + ", " + col + ") = " + num);
				num++;
				//尝试往当前方向走
				int temp_row = row + way[k][0];
				int temp_col = col + way[k][1];
				if(temp_row<n+1 && temp_row>0 && temp_col<n+1 && temp_col>0)
				if(hxs[temp_row][temp_col] == 0) {
					row = temp_row;
					col = temp_col;
				}
				
			}else {			//当前位置已经填数，方向改变
				k = (k + 1) % 4;
				row = row + way[k][0];
				col = col + way[k][1];
			}
		}
		/*遍历*/
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(hxs[i][j] + "  ");
			}
			System.out.print('\n');
		}
		
	}
}
