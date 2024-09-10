package edu.iftm.br.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

 class CalculadoraTest {

    @Test
     void testConstrutorSemParametro() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.getMemoria(), "A memória inicial deve ser 1");
    }

    @Test
     void testConstrutorComParametro() {
        Calculadora calc = new Calculadora(3);
        assertEquals(3, calc.getMemoria());

    }

    @Test
     void testSomarNumeroNegativo() {
        Calculadora calc = new Calculadora(3);
        calc.somar(-2);
        assertEquals(1, calc.getMemoria());
    }

    @Test
     void testSomarNumeroPositivo() {
        Calculadora calc = new Calculadora(3);
        calc.somar(2);
        assertEquals(5, calc.getMemoria());
    }

    @Test
     void testSubtrairNumeroNegativo() {
        Calculadora calc = new Calculadora(3);
        calc.subtrair(-2);
        assertEquals(3, calc.getMemoria());
    }

    @Test
     void testSubtrairNumeroPositivo() {
        Calculadora calc = new Calculadora(3);
        calc.subtrair(2);
        assertEquals(3, calc.getMemoria());
    }

    @Test
     void testMultiplicarNumeroNegativo() {
        Calculadora calc = new Calculadora(3);
        calc.multiplicar(-2);
        assertEquals(-6, calc.getMemoria());
    }

    @Test
     void testMultiplicarNumeroPositivo() {
        Calculadora calc = new Calculadora(3);
        calc.multiplicar(2);
        assertEquals(6, calc.getMemoria());
    }

    @Test
     void testMultiplicarNumeroPorZero() {
    Calculadora calc = new Calculadora(3);
    calc.multiplicar(0);
    assertEquals(0, calc.getMemoria());
    }

    @Test
     void testDividirNumeroNegativo() throws Exception {
        Calculadora calc = new Calculadora(6);
        calc.dividir(-2);
        assertEquals(-3, calc.getMemoria());
    }

    

    @Test
     void testDividirNumeroPositivo() throws Exception {
        Calculadora calc = new Calculadora(3);
        calc.dividir(2);
        assertEquals(1.5, calc.getMemoria());
    }

    @Test
     void testDividirPorZero() {
        Calculadora calc = new Calculadora(3);
        assertThrows(Exception.class, () -> calc.dividir(0) );
      
    }

    @Test
     void testExponenciarNumeroNegativo() throws Exception {
        Calculadora calc = new Calculadora(3);
        calc.exponenciar(-2);
        assertEquals(-9, calc.getMemoria());
    }

    @Test
     void testExponenciarNumeroPositivo() throws Exception {
        Calculadora calc = new Calculadora(3);
        calc.exponenciar(2);
        assertEquals(9, calc.getMemoria());
    }

  
}
