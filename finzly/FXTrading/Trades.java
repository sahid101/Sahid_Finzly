package com.finzly.FXTrading;

class Trades {
    private  int tradeNo;
    private  double rate = 85;
    private String name;
    private String currencyPair;
    private double amount;


    public Trades() {
    }
    public int getTradeNo() {
        return tradeNo;
    }
    public double getRate() {
        return rate;
    }
    public Trades(String name, String currencyPair, double amount, int tradeNo) {
        this.name = name;
        this.currencyPair = currencyPair;
        this.amount = amount;
        this.tradeNo = tradeNo;
    }
    public String getName() {
        return name;
    }
    public String getCurrencyPair() {
        return currencyPair;
    }
    public double getAmount() {
        return amount;
    }
}
