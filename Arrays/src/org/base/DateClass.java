package org.base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh.mm.ss");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		Calendar cal= Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE));
		

	}
}