package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import logic.DateFormatter;

class TestFormatter {

	@Test
	void testDate() throws ParseException {
		String date = "2020/12/31";
		//String date = "31/12/2020"
		DateFormatter df = new DateFormatter();
		assertEquals(true, df.checkDate(date));
	}
	
}

	