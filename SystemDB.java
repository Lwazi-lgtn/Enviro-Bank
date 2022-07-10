package com.eviro.assessment.grad001.LwaziTomson;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//since we not using a real DB
//I decided to use java collections framework
//used hashMap so that i can differentiate accounts using keySet,, which will be customer number
public class SystemDB {
	

	public static Map<String, SavingsAccount> savings() {
		Map<String, SavingsAccount> mapSavings = new HashMap<String, SavingsAccount>();
		mapSavings.put("CustomerLwazi", new SavingsAccount(101, "1", new BigDecimal("2000")));
		mapSavings.put("CustomerMaluka", new SavingsAccount(102, "2", new BigDecimal("5000")));

		return mapSavings;
	}

	public static Map<String, CurrentAccount> current() {
		Map<String, CurrentAccount> mapCurrent = new HashMap<String, CurrentAccount>();
		mapCurrent.put("Customer1", new CurrentAccount(103, "3", new BigDecimal("1000"), new BigDecimal("10000")));
		mapCurrent.put("Customer2", new CurrentAccount(104, "4", new BigDecimal("-5000"), new BigDecimal("20000")));

		return mapCurrent;
	}

}
