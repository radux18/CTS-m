package com.compay.seminar2.solid;

public interface Account {
    void withdraw(long amount) throws InsuficientFundsException;

    void deposit(long amount);
}
