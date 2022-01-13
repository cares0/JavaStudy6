package com.cares.ex1.func;

import java.util.Scanner;

public class Function {

	private Scanner sc;
	
	public Function() {
		sc = new Scanner(System.in);
	}
	
	public void printSub(String string) {
		System.out.println("=====================");
		System.out.println(string);
		System.out.println("=====================");
		
	}
	
	public void printDataSub() {
		System.out.println("이름\t별명\t이메일\t\t전화번호\t\t생일");
		System.out.println("===================================");
	}
	
	public int menuSelect() {
		this.printSub("원하는 메뉴를 선택해주세요.");
		System.out.println("1. 전체 출력");
		System.out.println("2. 정보 검색");
		System.out.println("3. 정보 추가");
		System.out.println("4. 정보 제거");	
		System.out.println("5. 종    료");
		int select = sc.nextInt();
		return select;
	}
	
}
