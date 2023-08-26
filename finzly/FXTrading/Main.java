package com.finzly.FXTrading;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

    static ArrayList<Trades> Trade = new ArrayList<>();
    public static void main(String[] args) {
        Trades t = new Trades();
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Welcome To FX Trading------------\n");
        while (true) {
            System.out.println("| Book Trade - 1 \n| Print Trades - 2 \n| Exit - 3");
            String dec =  sc.next();
            if(!(dec.matches("[1-3]"))){
                System.out.println("Enter valid choice.\n");
                continue;
            }
            int decision = Integer.parseInt(dec);
            switch (decision) {
                case 1:
                    bookTrade(t.getRate());
                    break;
                case 2:
                    printTrades();
                    System.out.println("_____________________________________________________________________\n");
                    break;
                case 3:
                    exitProgram(sc);
                    break;
                default:
                    System.out.println("Please Enter Again.\n");
            }
        }
    }

    static void bookTrade(Double rate){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter customer Name :");
        String name = sc.nextLine();
        if(!isValidName(name)){
            System.out.println("Invalid Name provided.\n");
            return;
        }

        System.out.println("Enter Currency Pair :");
        String currencyPair = getCurrencyPair(sc);


        System.out.println("Enter Amount to transfer :");
        double amount = getValidAmount(sc);

        String rateDecision = getConfirmation(sc);
        if((rateDecision.equalsIgnoreCase("yes"))){
            System.out.printf("You are transferring INR %,.0f to %s " +
                    "( Assuming that rate was %.2f)\n",(amount*rate),name,rate);

        }

        System.out.println("Book/Cancel this trade?");
        String bookTradeDecision =  getBookingConfirm(sc);

        if(bookTradeDecision.equalsIgnoreCase("book")){
            double totalAmount = amount*rate;
            bookingSuccess(name,currencyPair,totalAmount,rate);
        }
        if(bookTradeDecision.equalsIgnoreCase("cancel")){
            System.out.println("Trade is Canceled.\n");
        }

    }

    static double getValidAmount(Scanner scanner){
        double amount = 0;
        while (true){
            if(scanner.hasNextDouble()){
                amount = scanner.nextDouble();
                if(amount<=1){
                    System.out.println("Enter a amount greater than zero");
                    return getValidAmount(scanner);
                }
                break;
            }
            else{
                System.out.println("Enter a valid input");
                scanner.next();
            }
        }
        return amount;
    }

    static String getConfirmation(Scanner scanner){

        System.out.println("Do you want to get Rate (yes/no)");
        String validation = scanner.next();

        while (!(validation.equalsIgnoreCase("yes")||validation.equalsIgnoreCase("no"))){
            System.out.println("Please enter a valid input");
            validation = scanner.next();

        }
        return validation;
    }

    static boolean isValidName(String name){
        return !name.isEmpty() && name.matches("[a-zA-Z. ]+$");
    }
    static String getCurrencyPair(Scanner scanner){
        String str = scanner.next();
        while(!(str.equalsIgnoreCase("usdinr"))){
            System.out.println("Please Enter USDINR to continue.");
            str = scanner.next();
        }
        return str;
    }

    static String getBookingConfirm(Scanner scanner){
        String decision = scanner.next();
        while(!(decision.equalsIgnoreCase("book")|| decision.equalsIgnoreCase("cancel"))){
            System.out.println("Please Enter either book or cancel.");
            decision = scanner.next();
        }
        return decision;
    }
    static void bookingSuccess(String name,String currencyPair,double amount, double rate){
        System.out.printf("Trade for %s has been booked with rate %.2f, " +
                "The amount of Rs %,.0f will be transferred in 2 working days to %s"
                ,currencyPair.toUpperCase(),rate,amount,name.toUpperCase());
        System.out.println();
        Trade.add(new Trades(name,currencyPair.toUpperCase(),amount, Trade.size()+1));
    }

    static void printTrades(){
        System.out.println("Recent Trades below: ");
        System.out.printf("%-8s%-14s%-15s%-12s%-8s%n", "TradeNo", "CurrencyPair", "CustomerName", "Amount", "Rate");
        for (Trades trade: Trade) {
            System.out.printf("\n%-8d%-14s%-15sINR%,-12.0f%-8.2f%n",
                    trade.getTradeNo(),trade.getCurrencyPair(),trade.getName(),trade.getAmount(),trade.getRate());
        }
    }

    static void exitProgram(Scanner scanner){
        System.out.println("Do you really want to exit (y/n)");
        String decision = scanner.next();
        while (true) {
            if (decision.equalsIgnoreCase("yes") || decision.equalsIgnoreCase("y")) {
                System.out.println("Bye - have a good day\n");
                System.exit(0);
            } else if (decision.equalsIgnoreCase("no") || decision.equalsIgnoreCase("n")) {
                System.out.println("OK");
                break;
            } else {
                System.out.println("Try again with y or n");
                decision = scanner.next();
            }
        }
    }

}

