package edu.iftm.br.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testConstrutorSemParametro() {
        Calculadora calc = new Calculadora();

    }

    @Test
    public void testConstrutorComParametro() {
        Calculadora calc = new Calculadora(3);
        assertEquals(3, calc.getMemoria());

    }

    @Test
    public void testSomarNumeroNegativo() {
        Calculadora calc = new Calculadora(3);
        calc.somar(-2);
        assertEquals(1, calc.getMemoria());
    }

    @Test
    public void testSomarNumeroPositivo() {
        Calculadora calc = new Calculadora(3);
        calc.somar(2);
        assertEquals(5, calc.getMemoria());
    }

    @Test
    public void testSubtrairNumeroNegativo() {
        Calculadora calc = new Calculadora(3);
        calc.subtrair(-2);
        assertEquals(3, calc.getMemoria());
    }

    @Test
    public void testSubtrairNumeroPositivo() {
        Calculadora calc = new Calculadora(3);
        calc.subtrair(2);
        assertEquals(3, calc.getMemoria());
    }

    @Test
    public void testMultiplicarNumeroNegativo() {
        Calculadora calc = new Calculadora(3);
        calc.multiplicar(-2);
        assertEquals(-6, calc.getMemoria());
    }

    @Test
    public void testMultiplicarNumeroPositivo() {
        Calculadora calc = new Calculadora(3);
        calc.multiplicar(2);
        assertEquals(6, calc.getMemoria());
    }

    @Test
    public void testMultiplicarNumeroPorZero() {
    Calculadora calc = new Calculadora(3);
    calc.multiplicar(0);
    assertEquals(0, calc.getMemoria());
    }

    @Test
    public void testDividirNumeroNegativo() throws Exception {
        Calculadora calc = new Calculadora(6);
        calc.dividir(-2);
        assertEquals(-3, calc.getMemoria());
    }

    

    @Test
    public void testDividirNumeroPositivo() throws Exception {
        Calculadora calc = new Calculadora(3);
        calc.dividir(2);
        assertEquals(1.5, calc.getMemoria());
    }

    @Test
    public void testDividirPorZero() {
        Calculadora calc = new Calculadora(3);
        assertThrows(Exception.class, () -> calc.dividir(0) );
      
    }

    @Test
    public void testExponenciarNumeroNegativo() throws Exception {
        Calculadora calc = new Calculadora(3);
        calc.exponenciar(-2);
        assertEquals(-9, calc.getMemoria());
    }

    @Test
    public void testExponenciarNumeroPositivo() throws Exception {
        Calculadora calc = new Calculadora(3);
        calc.exponenciar(2);
        assertEquals(9, calc.getMemoria());
    }

  
}
