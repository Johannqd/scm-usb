package co.edu.usbcali.scm;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test() {
		Fibonacci f = new FibonacciImpl();
		
		f.calcularFibonacci(1, 50000);
		assertTrue(f.getResultado()==46368);
	}

}
