package co.edu.unbosque.model;

public class AlgoritmoEuclidiano {

	public AlgoritmoEuclidiano() {

	}

	public int calcularMCD (int a , int b) {
		int residuo = 0;
		int div = 0;
		while(b!=0) {
			residuo=a%b;
			div=a/b;
			a=b;
			b=residuo;
		}
		return a;
	}
}


