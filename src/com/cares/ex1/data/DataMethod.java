package com.cares.ex1.data;

import java.util.ArrayList;
import java.util.Scanner;

import com.cares.ex1.func.Function;

public class DataMethod {

	private Function function;
	private Scanner sc;

	public DataMethod() {
		function = new Function();
		sc = new Scanner(System.in);
	}

	public ArrayList<PersonDTO> dataDelete(ArrayList<PersonDTO> arr) {
		if (arr.size() == 0) {
			function.printSub("입력된 정보가 없습니다!!");
		} else {

			function.printSub("정보를 삭제합니다.");
			System.out.println("삭제하고자 하는 정보의 이름을 입력해주세요.");
			String search = sc.next();
			boolean check = true;

			for (int i=0;i<arr.size();i++) {
				if (search.trim().equals(arr.get(i).getName().trim())) {
					arr.remove(i);
					function.printSub("삭제 완료!!");
					check = false;
					break;
				}
			}
			if (check) {
				function.printSub("검색하신 정보가 없습니다!!");
				return null;
			}
		}
		return arr;
	}

	public void dataSearch(ArrayList<PersonDTO> arr) {
		if (arr.size() == 0) {
			function.printSub("입력된 정보가 없습니다!!");
		} else {
			function.printSub("정보를 검색합니다.");
			System.out.println("검색하고자 하는 정보의 이름을 입력해주세요.");
			String search = sc.next();
			boolean check = true;
			for(int i=0;i<arr.size();i++) {
				if (search.trim().equals(arr.get(i).getName().trim())) {
					ArrayList<PersonDTO> arrSearch = new ArrayList<>();
					arrSearch.add(arr.get(i));
					this.dataPrint(arrSearch);
					check = false;
					break;
				}	
			}
			if (check) {
				function.printSub("검색하신 정보가 없습니다!!");

			}
		}
	}

	public void dataPrint(ArrayList<PersonDTO> arr) {	
		if (arr.size() == 0) {
			function.printSub("입력된 정보가 없습니다!!");
		} else {

			function.printSub("정보를 출력합니다.");
			function.printDataSub();

			for(int i=0;i<arr.size();i++) {
				System.out.print(arr.get(i).getName()+ "\t");
				System.out.print(arr.get(i).getNickname()+ "\t");
				System.out.print(arr.get(i).getEmail()+ "\t");
				System.out.print(arr.get(i).getPhoneNum()+ "\t");
				System.out.print(arr.get(i).getBirthday()+ "\t");			
				System.out.println();
			}
		}
	}


	public PersonDTO addData() {
		function.printSub("정보를 추가합니다.");
		PersonDTO personDTO = new PersonDTO();
		System.out.println("이름을 입력해주세요.");
		personDTO.setName(sc.next());			
		System.out.println("별명을 입력해주세요.");
		personDTO.setNickname(sc.next());
		System.out.println("이메일을 입력해주세요.");
		personDTO.setEmail(sc.next());
		System.out.println("전화번호를 입력해주세요.");
		personDTO.setPhoneNum(sc.next());
		System.out.println("생일을 입력해주세요.");
		personDTO.setBirthday(sc.next());

		return personDTO;
	}

}
