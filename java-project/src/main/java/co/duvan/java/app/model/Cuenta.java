package co.duvan.java.app.model;

import java.math.BigDecimal;

public class Cuenta {

    //* Vars
    private String userName;
    private BigDecimal saldo;

    //* Constructor
    public Cuenta(String userName, BigDecimal saldo) {
        this.userName = userName;
        this.saldo = saldo;
    }

    //* Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}
