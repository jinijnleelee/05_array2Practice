package edu.kh.array2.practice.service;

import java.util.Arrays;

public class PracticeService {

	public void practice7(){
		
		//1차원 문자열 배열에 학생 이름 초기화되어 있다.
		//3행 2열 짜리 2차원 문자열 배열 2개를 새로 선언 및 할당하여
		//학생 이름을 2차원 배열에 순서대로 저장하고 아래와 같이 출력하시오.
		//(첫 번째 2차원 배열이 모두 저장된 경우 두 번째 2차원 배열에 저장 진행)
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String std[][] = new String[3][2];
		
		for(int i = 0; i<std.length; i++) {
			System.out.println("== "+(i+1)+"분단 ==");
			for(int j =0; j<std[i].length; j++) {
				
				std[i][j]= students[i];
				
				
				
				
			}
			System.out.println(Arrays.deepToString(std));
		}
		
	}
}
