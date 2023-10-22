package com.example.freetrader.exception;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class AssetNotFoundException extends RuntimeException{
    public AssetNotFoundException(String message){
        super(message);
    }
}
