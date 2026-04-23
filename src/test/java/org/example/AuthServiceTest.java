package org.example;

import org.junit.jupiter.api.Test;
import  static  org.junit.jupiter.api.Assertions.*;
public class AuthServiceTest {
    @Test
    void deveRetornarTokenQuandoLoginValido(){
        AuthService service = new AuthService();

        String token = service.login("admin","1234");

       assertNotNull(token);
       assertEquals("TOKEN_ABC", token);

    }
    @Test
    void deveRetornrNullQuandoLoginInvalido(){
        AuthService service = new AuthService();

        String token = service.login("user","pass");

        assertNull(token);
    }

    @Test
    void deveValidarUsuarioAdmin(){
        AuthService service =  new AuthService();
        assertTrue(service.isAdmin("admin"));
        assertFalse(service.isAdmin("user"));
    }
    @Test
    void deveVerificarTokenValido(){
        AuthService service = new AuthService();
        assertTrue(service.verificarToken("TOKEN_ABC"));
        assertFalse(service.verificarToken("TOKEN_ERRADO"));
    }
}
