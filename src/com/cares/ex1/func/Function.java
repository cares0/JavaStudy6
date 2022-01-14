package com.cares.ex1.func;

import java.util.ArrayList;
import java.util.Scanner;

import com.cares.ex1.data.DataMethod;
import com.cares.ex1.data.PersonDTO;

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

	public void menuSelect() {
		DataMethod dataMethod = new DataMethod();
		ArrayList<PersonDTO> arr = new ArrayList<>();


		boolean check = true;

		while (check) {
			this.printSub("원하는 메뉴를 선택해주세요.");
			System.out.println("1. 전체 출력");
			System.out.println("2. 정보 검색");
			System.out.println("3. 정보 추가");
			System.out.println("4. 정보 제거");	
			System.out.println("5. 종    료");
			int select = sc.nextInt();

			if (select == 1) {				
				dataMethod.dataPrint(arr);				
			} else if (select == 2) {
				dataMethod.dataSearch(arr);
			} else if (select == 3) {
				arr.add(dataMethod.addData());
			} else if (select == 4) {
				arr = dataMethod.dataDelete(arr);
			} else if (select == 5) {
				this.printSub("프로그램을 종료합니다.");
				check = false;
			} else {
				System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

}
