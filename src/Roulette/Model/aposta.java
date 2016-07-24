package Model;

public class aposta {
	private int[] dotzena;
	private int[] num;
	private int manca;
	private int passa;
	private int parell;
	private int senar;
	private int negre;
	private int vermell;
	private int total;
	
	

	public aposta(){
		int i;
		this.num = new int[37];
		for (i = 0; i < 36; i++){
			this.num[i] = 0;
		}
		this.dotzena = new int[4];
		for (i = 1; i < 4; i++){
			
			this.dotzena[i] = 0;
		}
		this.manca = 0;
		this.passa = 0;
		this.parell = 0;
		this.senar = 0;
		this.negre = 0;
		this.vermell = 0;
		this.total = 0;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getDotzena(int i) {
		return dotzena[i];
	}

	public void setDotzena(int i, int diners) {
		dotzena[i] += diners;
		total += diners;
	}
	public int getNum(int i) {
		return num[i];
	}

	public void setNum(int i, int diners) {
		num[i] += diners;
		total += diners;
	}

	public int getManca() {
		return manca;
	}

	public void setManca(int manca) {
		this.manca += manca;
		total += this.manca;
	}

	public int getPassa() {
		return passa;
	}

	public void setPassa(int passa) {
		this.passa += passa;
		total += passa;
	}

	public int getParell() {
		return parell;
	}

	public void setParell(int parell) {
		
		this.parell += parell;
		total += parell;
	}

	public int getSenar() {
		return senar;
	}

	public void setSenar(int senar) {
		this.senar += senar;
		total += senar;
	}

	public int getNegre() {
		return negre;
	}

	public void setNegre(int negre) {
		
		this.negre += negre;
		total += negre;
	}

	public int getVermell() {
		return vermell;
	}

	public void setVermell(int vermell) {
		this.vermell += vermell;		
		total += vermell;
	}
	
	public void reseteja(){
		for (int i = 0; i < 36; i++){
			num[i] = 0;
		}
		for (int i = 0; i < 4; i++){			
			this.dotzena[i] = 0;
			
		}
		this.manca = 0;
		this.passa = 0;
		this.parell = 0;
		this.senar = 0;
		this.negre = 0;
		this.vermell = 0;
		this.total = 0;
	}
	
}
