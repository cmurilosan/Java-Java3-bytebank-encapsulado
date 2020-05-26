package com.bytebank.model;

public abstract class Account {

    protected double balance;
    private int agency;
    private int number;
    private Client holder;
    private static int total = 0;

    public Account(int agency, int number){
        Account.total++;
        System.out.println("The total of account: " + Account.total);
        this.agency = agency;
        this.number = number;
        this.balance = 100;
        System.out.println("Creating the Account Number " + this.number);
    }

    public abstract void deposit(double value);

    public boolean withdraw(double value) {
        if(this.balance >= value) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double value, Account destiny) {
        if(this.withdraw(value)) {
            destiny.deposit(value);
            return true;
        } else {
        	return false;
        }
    }

    public double getBalance(){

        return this.balance;
    }

    public int getNumber(){

        return this.number;
    }

    public void setNumber(int number){
        if(number <= 0) {
            System.out.println("You can't put number below zero");
            return;
        }
        this.number = number;
    }

    public int getAgency(){

        return this.agency;
    }

    public void setAgency(int agency){
       if(agency <= 0) {
           System.out.println("Cannot be less than or equal zero");
           return;
       }
       this.agency = agency;
    }

    public void setHolder(Client holder){

        this.holder = holder;
    }

    public Client getHolder(){

        return this.holder;
    }

    public static int getTotal(){

        return Account.total;
    }

}