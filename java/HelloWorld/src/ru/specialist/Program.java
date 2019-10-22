package ru.specialist;

import java.util.Calendar;
import java.util.Date;
//import java.util.Date;
//import java.util.Calendar;
//import java.util.*;
//import java.sql.*;

/**
 * 
 * Main program class
 * 
 * @author Student
 *
 */
public class Program {

	
	/**
	 * My counter
	 */
	int counter;
	
	/**
	 * Program entry point
	 * @param args Command line parameters
	 */
	public static void main(String[] args) {
		
		//Program p;
		//java.util.Date now;
		

		/*
		Date now;  // Строчный комментарий
		Calendar c;*/
		Date now = new Date();
		System.out.println(now.getSeconds());
		
		System.out.println("Hello ugly world!");
	}
}
