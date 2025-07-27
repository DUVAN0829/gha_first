package co.duvan.java.app.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void comprobarUserName() {

        Cuenta cuenta = new Cuenta("Duvan0829.", new BigDecimal(200));

        assertAll(
                () -> assertEquals("Duvan0829", cuenta.getUserName(), () -> "El usuario no corresponde")
        );

    }

}