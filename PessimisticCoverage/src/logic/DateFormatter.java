package logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * This method check if a string of a formatted date is equals to an input string.
 * The method expects the date format to be "dd/MM/yyyy" and the test method enters
 * the input string date. However, the test case is wrong! Because the entered string
 * has the wrong format "yyyy/MM/dd" and the test fails even though the dates are the
 * same and the method dateFormat is bug-free.
 */

public class DateFormatter {
	public boolean dateFormat(String s) throws ParseException {
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2020");
		String result = new SimpleDateFormat("dd/MM/yyyy").format(date);
		return result.equals(s);
	}
}
