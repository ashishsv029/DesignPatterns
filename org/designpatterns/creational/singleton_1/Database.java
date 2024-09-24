package org.designpatterns.creational.singleton_1;
public class Database {
    private static Database instance = null;
    private Database() { // Making constructor private, so that direct instantiation is not possible

    }
    public static Database getInstance() { // exposing a static method, do give the one and only instance of Database
        if (instance == null) {
            synchronized (Database.class) { // only locking instance creation part instead of making entire function synchronous to improve performance
                                            // lock was also acquired on entire database class
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {}
}

// Commmand to Run this file
// 1. go to appropriate directory or try absolute path
// 2. compile using :- javac org/designpatterns/creational/singleton/Database.java
// 3. run compiled class :-  java org/designpatterns/creational/singleton/Database.java