package com.wildchap.algorithm;
/**
 * 
 * @author wang	993704315@qq.com
 *
 *
 */
public class EightQueens {
	static int num = 0;
	static int[][] a = new  int[9][9];
	public static void main(String[] args) {
		EightQueens e = new EightQueens();
		e.f(1);
		System.out.println(num);
	}
	public void f(int k) {
		if(k <= 8) {
			for(int i=1; i<=8; i++) {
				boolean tag = true;
				for(int j=1; j<k; j++) {
					if(a[j][i] == 1) {
						tag = false;
						break;
					}
				}
				if(tag) {
					int row = k;
					int col = i;
					while(row > 1 && col > 1) {
						row--;
						col--;
						if(a[row][col] == 1) {
							tag = false;
							break;
						}
					}
					if(tag) {
						row = k;
						col = i;
						while(row > 1 && col < 8) {
							row--;
							col++;
							if(a[row][col] == 1) {
								tag = false;
								break;
							}
						}
						if(tag) {
							a[k][i] = 1;
							f(k+1);
							a[k][i] = 0;
						}
					}
				}
			}
		}else {
			num++;
		}
	}
}
