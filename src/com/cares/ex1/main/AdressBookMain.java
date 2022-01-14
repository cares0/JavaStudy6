package com.cares.ex1.main;

import java.util.ArrayList;
import java.util.HashMap;

import com.cares.ex1.data.DataMethod;
import com.cares.ex1.data.PersonDTO;
import com.cares.ex1.func.Function;

public class AdressBookMain {

	public static void main(String[] args) {
		Function function = new Function();		
		function.menuSelect();
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		map.put("a", ar);
		map.put("b", ar2);
		
		
		

	}

}
