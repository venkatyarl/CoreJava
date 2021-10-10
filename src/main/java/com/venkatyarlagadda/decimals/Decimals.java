package com.venkatyarlagadda.common.decimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Decimals {

	public static void main(String... args) {
		String preWeight = "66.7";
		String postWeight = "62.5";
		System.out.println(getWeightGain(preWeight, postWeight));
	}

	public static String getWeightGain(String preWeight, String postWeight) {
		return String.valueOf(BigDecimal.valueOf(
				Double.parseDouble(preWeight) 
				- Double.parseDouble(postWeight))
				.setScale(2, RoundingMode.HALF_UP).doubleValue());
	}

	public static Double convertToDecimal(String value) {
		return Double.parseDouble(value);
	}
}