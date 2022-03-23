package FuncaoLinear;

public class Funcao {
	
	private int a,b;
	//vetor para armazenar o resultado da função usando o x de -5 a 5
	private int[] y = new int[11];
	
	public Funcao(String x, String y) {
		a = Integer.parseInt(x);
		b = Integer.parseInt(y);
		calcularPontos();
		posicao();
	}

	public void calcularPontos() {
		int x = 0;
		//calcula o valor de y real
		for(int i = 0;i < 10;i++) {
			if(i%2==0) {
				x++;
				y[i] = a*x+b;				
			}
			else {
				y[i] = a*(-x)+b;				
			}
		
		}
		//guardando o valor de B proporcional ao da malha
		if(b > 0) y[10] = 200-(40*b);
		else  y[10] = 200+(40*(-b));
	}
	
	public void posicao() {
		//valor y proporcional a malha
		for(int i=0; i<10;i++) {
			if(y[i] > 0) y[i] = 200-(40*y[i]);
			else y[i] = 200+(40*(-y[i]));		
		}
	}
	
	public int[] getPontos() {
		return y;
	}
}
