package com.javaweb.utils;

public class NumberUtil {
	public static boolean checkNumber (String number) {
		try {
			Long n = Long.parseLong(number);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
