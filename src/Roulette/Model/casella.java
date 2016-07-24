package Model;

public class casella {
	private boolean manca;
	private boolean parell;
	private boolean negre;
	private int dotzena;
	private int numero;
	
	


	public casella (int num){
		this.numero = num;
		if (num < 19 ) {
			this.manca = true;
		}
		else {
			this.manca = false;
		}
	
		if (num % 2 == 0){
			this.parell = true;
		}
		else{
			this.parell = false;
		}
	
		if (num == 1 || num == 3 || num == 5 || num == 7 || num == 9 || num == 12 || num == 14 || num == 16 || num == 18 || num == 19 || num == 21 || num == 23 || num == 25 || num == 27 || num == 30 || num == 32 || num == 34 || num == 36 )
			this.negre = false;
		else { 
			this.negre = true;
		}
		if (num < 13){
			this.dotzena = 1;
		}
		else{
			if (num < 25){
				this.dotzena = 2;
			}
			else{
				this.dotzena = 3;
			}
		}
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDotzena() {
		return dotzena;
	}

	public void setDotzena(int dotzena) {
		this.dotzena = dotzena;
	}

	public boolean isManca() {
		return manca;
	}

	public void setManca(boolean manca) {
		this.manca = manca;
	}

	public boolean isParell() {
		return parell;
	}

	public void setParell(boolean parell) {
		this.parell = parell;
	}

	public boolean isNegre() {
		return negre;
	}

	public void setNegre(boolean negre) {
		this.negre = negre;
	}
	public int getNumero() {
		// TODO Auto-generated method stub
		return numero;
	}
	
}
