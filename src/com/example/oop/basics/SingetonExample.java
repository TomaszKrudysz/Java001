package com.example.oop.basics;
class DBConnection {
    private static DBConnection instance;
    private DBConnection() {

    }
    public static DBConnection getInstance() {
        if(instance == null){
            instance = new DBConnection();
        }
        return  instance;
    }

    public void getFromDB() {
        System.out.println("dane z bazy");
    }
}
/**
 * Created by tkrud on 16.10.2022.
 */
public class SingetonExample {
    public static void main(String[] args) {
        DBConnection connection1 = DBConnection.getInstance();
        DBConnection connection2 = DBConnection.getInstance();
        System.out.println(connection1 == connection2);

        connection2.getFromDB();
    }
}
