package edu.kh.array2.practice;

import java.util.Arrays;

public class Array2Practice {
	public void practice1(){
		String std[][] = new String[3][3];
		for(int i =0; i<std.length; i++) {//행
			for(int j = 0; j<std.length; j++) {//열
				std[i][j] = "(" + i+ ","+j+  ")";
			System.out.println(Arrays.deepToString(std));
				
			}
		}
	}
	
	
}
