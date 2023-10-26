package hellojpa.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Arrays;

public class PracticeLocalDate {

	public static void main(String[] args) {
		System.out.println(LocalDate.now().getYear() / 100 * 100 + "");
		DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("yyyy-MM")
			.parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
			.toFormatter();
		LocalDate date = LocalDate.parse("2018-09", formatter);
		System.out.println(date);
		Integer[] integers = new Integer[20];
	}
}
