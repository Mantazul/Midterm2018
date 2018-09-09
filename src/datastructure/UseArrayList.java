package datastructure;
import databases.ConnectToMongoDB;

import java.io.*;
import java.sql.*;
import java.util.*;

public class UseArrayList {


	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	 List<Integer> list = new ArrayList<Integer>();
	 list.add(45);
	 list.add(67);
	 list.add(90);
	 list.add(34);

		System.out.println("Elements of the array list:");
	 for(Integer i: list) System.out.print(i+" ");
		System.out.println("\nsecond element in ArrayList: "+ list.get(1));
	 list.remove(1);
		System.out.println("Elements of the array list After deleting second element:");
		for(Integer i: list) System.out.print(i+" ");
		System.out.println("\nLast element added in array list: " + list.get(list.size()-1));

		ConnectToMongoDB connect1 = new ConnectToMongoDB();
		List<Integer> list1 = connect1.insertArrayList(list);
		System.out.println("ArrayList printed from database: ");
		for(Integer i:list1){
			System.out.print(i+" ");
		}


	}


	}


