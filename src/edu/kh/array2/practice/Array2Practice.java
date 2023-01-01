package edu.kh.array2.practice;

import java.util.Arrays;

public class Array2Practice {
	public void practice1(){
		String[][] arr = new String[3][3];
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++)
				System.out.print("(" + row + ", " + col + ")");
			System.out.println();
		}
	}

	public void practice2() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 1 ~ 16까지 값을 차례대로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.

		int[][] arr= new int[4][4];
		int num = 1;
			for (int row = 0; row < arr.length; row++) {
				//인덱스 0부터 시작해서 행의 길이를 순차적으로 돌려라 
				
				for (int col2 = 0; col2 < arr[row].length; col2++) {
				//첫번째 포문의 행의 열길이를  순차적으로 돌려라 
					arr[row][col2] +=num++;
					//arr의 배열안에 순차적으로 num의 숫자를 1씩 늘려서 넣어
			
			System.out.printf("%2d ", arr[row][col2]);
			//arr의 배열을 2자리 숫자로 출력하라 
		}
				System.out.println();//줄바꿈 
	}
		}

	
	public void practice3() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 1 ~ 16까지 값을 차례대로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.

		int[][] arr= new int[4][4];
		int num = 16;
			for (int row = 0; row < arr.length; row++) {
				//인덱스 0부터 시작해서 행의 길이를 순차적으로 돌려라 
				
				for (int col2 = 0; col2 < arr[row].length; col2++) {
				//첫번째 포문의 행의 열길이를  순차적으로 돌려라 
					arr[row][col2] +=num--;
					//arr의 배열안에 순차적으로 num의 숫자16부터 1씩 줄여서 넣으셈 
			
			System.out.printf("%2d ", arr[row][col2]);
			//arr의 배열을 2자리 숫자로 출력하라 
		}
				System.out.println();//줄바꿈 
	}
		}
		
	
	public void practice4() {
		
		int rowSum = 0;
		int colSum = 0;
		int sum = 0;
		
		int arr[][] = new int[4][4];
		for(int row = 0; row<arr.length; row++) {
			for(int col = 0; col<arr[0].length; col++) {

			
			
		
		
				
				
				
			System.out.print(arr[row][col]);
			}
			System.out.println();
		}
		
		
	}

}
