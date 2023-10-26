package com.example.freetrader.exception;

public class MarketNotFoundException extends RuntimeException{
    public MarketNotFoundException(String message){
        super(message);
    }
}

