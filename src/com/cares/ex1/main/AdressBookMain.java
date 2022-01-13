package com.cares.ex1.main;

import java.util.ArrayList;

import com.cares.ex1.data.DataMethod;
import com.cares.ex1.data.PersonDTO;
import com.cares.ex1.func.Function;

public class AdressBookMain {

	public static void main(String[] args) {
		Function function = new Function();
		DataMethod dataMethod = new DataMethod();
		ArrayList<PersonDTO> arr = new ArrayList<>();
		
		boolean check = true;
		
		while (check) {
			int select = function.menuSelect();
			
			if (select == 1) {				
				dataMethod.printData(arr);				
			} else if (select == 2) {
				dataMethod.dataSearch(arr);
			} else if (select == 3) {
				arr.add(dataMethod.addData());
			} else if (select == 4) {
				arr = dataMethod.dataDelete(arr);
			} else if (select == 5) {
				check = false;
			} else {
				System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
		
		
		

	}

}
