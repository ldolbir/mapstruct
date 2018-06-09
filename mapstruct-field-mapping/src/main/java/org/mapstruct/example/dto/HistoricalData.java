package org.mapstruct.example.dto;

import java.util.List;

public class HistoricalData {
    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    private List<Transaction> transactions;
}
