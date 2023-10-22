package com.example.freetrader.exception;

public class AssetAlreadyExistException extends RuntimeException{
    public AssetAlreadyExistException(String message){
        super(message);
    }
}
