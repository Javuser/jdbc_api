package com.nurbakyt.jdbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Connection conn = connection();
        System.out.println("Creating tables...");
        fileRead(conn, "/resources/schema.sql");
        System.out.println("Tables created!");
        fileRead(conn, "/resources/data.sql");
        System.out.println("Data inserted!");

    }

    public static Connection connection() {
        Connection c = null;
        //Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/jjd",
                            "postgres", "2oo1Nurik");
            System.out.println("База данных успешно открыт!");

            //stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);

        }
        System.out.println("Table successfully created!");

        return c;

    }
    public static void fileRead(Connection c, String file) throws FileNotFoundException{
        Scanner sc = new Scanner(
                new File(System.getProperty("user.dir") + "/jdbc/src/main/java") + file)
                .useDelimiter(";");
        try{
            while(sc.hasNext()){
                c.createStatement().execute(sc.next().trim());
            }
        }catch (SQLException throwables){
            System.out.println(throwables.getMessage());
        }
        sc.close();
    }
}

