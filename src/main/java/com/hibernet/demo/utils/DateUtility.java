package com.hibernet.demo.utils;

import java.time.LocalDateTime;

public class DateUtility {
	private DateUtility() {
	}

	public static LocalDateTime today() {
		return LocalDateTime.now();
	}
}
