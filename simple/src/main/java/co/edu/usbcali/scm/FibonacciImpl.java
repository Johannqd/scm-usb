package co.edu.usbcali.scm;

public class FibonacciImpl implements Fibonacci {
    private int num1=0;
    private int aux;
    private int r=0;
	public void calcularFibonacci(int num2, int limite) {
 
        while (num2 + num1 <= limite) {
            aux = num1;
            num1 = num2;
            num2 = aux + num1;
            r=num2;
        }

	}

	public int getResultado() {
		return r;

	}

	public void imprimir() {
		System.out.println("La serie fibonacci es: "+getResultado());

	}

}
