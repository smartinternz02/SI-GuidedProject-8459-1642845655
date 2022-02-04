package com.vishaamber.springexpensetracker.services;

import com.vishaamber.springexpensetracker.models.Balance;

public interface BalanceService {
	public Balance saveBalance(Balance balance);
	public Balance createBalance();
}
