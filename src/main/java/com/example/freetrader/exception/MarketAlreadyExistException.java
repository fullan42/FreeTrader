package com.example.freetrader.exception;

public class MarketAlreadyExistException extends RuntimeException{
    public MarketAlreadyExistException(String message){
        super(message);
    }
}

