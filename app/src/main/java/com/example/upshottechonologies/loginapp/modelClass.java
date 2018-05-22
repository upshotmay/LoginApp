package com.example.upshottechonologies.loginapp;

public class modelClass  {
    static final String DB_NAME = "LOGIN_DB";
    static final String TB_NAME = "LOGIN_TB";
    static final String ID = "id";
    static final String U_NAME ="username";
    static final String PWD = "password";
    static final int VERSION = 1;

    static final String CREATE_TABLE = "CREATE TABLE "+TB_NAME +"( "+ID+ " INTEGER PRIMARY KEY AUTOINCREMENT,"+
            U_NAME + " TEXT, "+ PWD+ " TEXT )";
}
