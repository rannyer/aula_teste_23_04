package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaBancariaTest {

    @Test
    void deveSacarValorValido(){
        ContaBancaria conta =  new ContaBancaria(100);

        conta.sacar(40);

        assertEquals(60, conta.getSaldo());

    }

    @Test
    void naoDevePermitirSacarValorNegativo(){
        ContaBancaria contaBancaria = new ContaBancaria(100);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> contaBancaria.sacar(-10)
        );
        assertEquals("Nao pode ser efetuado saque negativo", exception.getMessage());
        assertEquals(100, contaBancaria.getSaldo());

    }
    @Test
    void naoDevePermitirSacarValorMaiorQueSaldo(){
        ContaBancaria contaBancaria = new ContaBancaria(100);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> contaBancaria.sacar(150)
        );
        assertEquals("Nao pode sacar valor maior que saldo", exception.getMessage());
        assertEquals(100, contaBancaria.getSaldo());
    }
    @Test
    void saldoNaoDeveMudarQuandoSacarValorNegativo(){
        ContaBancaria contaBancaria =  new ContaBancaria(100);

        assertThrows(IllegalArgumentException.class, () -> contaBancaria.sacar(-10));

        assertEquals(100, contaBancaria.getSaldo());

    }

    @Test
    void deveRetornarFalseQuandoSacarValorNegativo(){
        ContaBancaria contaBancaria =  new ContaBancaria(100);
        boolean resultado = contaBancaria.sacar2(-10);
        assertFalse( resultado);
    }


}
