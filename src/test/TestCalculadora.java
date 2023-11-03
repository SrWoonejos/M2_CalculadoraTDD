package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dmiranda.Calculadora;

public class TestCalculadora {
	
	   Calculadora calculadora = new Calculadora();
	   
	    @Test
	    public void sumarTest(){
	    double result = calculadora.sumar(2,2);
	    assertEquals(4,result,0);
	    }
	    
	    @Test
	    public void restarTest(){
	        double result = calculadora.restar(5,2);
	        assertEquals(3,result,0);
	    }
	    
	    @Test
	    public void multiplicarTest(){
	        double result = calculadora.multiplicar(5,2);
	        assertEquals(10,result,0);
	    }
	    
	    @Test
	    public void dividirTest(){
	        double result1 = calculadora.dividir(5,2);
	        assertEquals(2.5,result1,0);
	        Double result2 = calculadora.dividir(5,0);
	        assertEquals(null,result2);
	    }

}
