package com.alessio.exercises.collections;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAccount {
    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        public Account(double amount, double interestRate, LocalDateTime duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }
        public double getInterestRate() {
            return interestRate;
        }
        public LocalDateTime getDuePayment() {
            return duePayment;
        }
    }

    public static void sortByAmount(List<Account> accounts) {
        Collections.sort(accounts, Comparator.comparing(Account::getAmount));
    }
    public static void sortByInterestRate(List<Account> accounts) {
        Collections.sort(accounts, Comparator.comparing(Account::getInterestRate));
    }
    public static void sortByDuePayment(List<Account> accounts) {
        Collections.sort(accounts, Comparator.comparing(Account::getDuePayment));
    }
}
