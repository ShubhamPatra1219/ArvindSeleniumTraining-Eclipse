package day11;

import java.util.ArrayList;
import java.util.List;

public class ExampleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] std = new String[3];
		
		// List is an Interface. Can not Create Object.
		List <String> li = new ArrayList<String>();
		ArrayList <String> ar = new ArrayList<String>();
        ar.add("Shubham");
        ar.add("Arvind");
        ar.add("Avi");
        ar.add("Mahesh");
        ar.add(2,"Kishore Kumar");
        System.out.println(ar);
        System.out.println("The Size of String Array: "+ar.size());
	}

}
