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

	public PersonDTO search(ArrayList<PersonDTO> arr) {
		if (arr.size() == 0) {
			this.printSub("입력된 정보가 없습니다!!");
		} else {
			PersonDTO personDTO = new PersonDTO();
			this.printSub("정보를 검색합니다.");
			System.out.println("검색하고자 하는 정보의 이름을 입력해주세요.");
			String search = sc.next();
			boolean check = true;
			for(int i=0;i<arr.size();i++) {
				if (search.trim().equals(arr.get(i).getName().trim())) {
					personDTO = arr.get(i);
					check = false;
					return personDTO;
				}	
			}
			if (check) {
				this.printSub("검색하신 정보가 없습니다!!");				
			}
		}
		return null;
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
				dataMethod.dataPrint(this.search(arr));
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
