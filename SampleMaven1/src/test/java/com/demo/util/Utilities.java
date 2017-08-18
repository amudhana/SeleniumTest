package com.demo.util;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Utilities {

	// Get random integer
	public static int getRandomInteger(int aStart, int aEnd) {
		Random aRandom = new Random();
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}

		// get the range, casting to long to avoid overflow problems
		long range = (long) aEnd - (long) aStart + 1;
		// compute a fraction of the range, 0 <= frac < range
		long fraction = (long) (range * aRandom.nextDouble());
		int randomNumber = (int) (fraction + aStart);
		return randomNumber;
	}

	public static String createDateForFileName() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss.SSS");
		return dateFormat.format(date);
	}

	
	public static String generateRandomString(int lettersNum) {
		String finalString = "";

		int numberOfLetters = 25;
		long randomNumber;
		for (int i = 0; i < lettersNum; i++) {
			char letter = 97;
			randomNumber = Math.round(Math.random() * numberOfLetters);
			letter += randomNumber;
			finalString += String.valueOf(letter);
		}
		return finalString;
	}
	
	// Creating file name
	public static String getFileName(String file) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		String fileName = file + dateFormat.format(cal.getTime());
		return fileName;
	}

	// Get absolute path
	public static String getPath() {
		String path = "";
		File file = new File("");
		String absolutePathOfFirstFile = file.getAbsolutePath();
		path = absolutePathOfFirstFile.replaceAll("\\\\+", "/");
		return path;
	}

	// Get absolute path
	public static String getPathUpload() {
		String path = "";
		File file = new File("");
		String absolutePathOfFirstFile = file.getAbsolutePath();
		path = absolutePathOfFirstFile.replaceAll("/", "//");
		return path;
	}

}
