package com.vishaamber.springexpensetracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishaamber.springexpensetracker.models.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Long> {

}
