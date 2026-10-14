/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author acer
 */
public class User {
     // Atribut dibuat private
    private String username;
    private String password;

    // Constructor kosong
    public User() {
        this.username = "";
        this.password = "";
    }

    // Constructor dengan parameter
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter username
    public String getUsername() {
        return username;
    }

    // Setter username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter password
    public String getPassword() {
        return password;
    }

    // Setter password
    public void setPassword(String password) {
        this.password = password;
    }

    // Method untuk mengecek login
    public boolean login(String username, String password) {
        return this.username.equals(username)
                && this.password.equals(password);
    }
}
