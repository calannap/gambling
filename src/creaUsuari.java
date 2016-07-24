package model;

@SuppressWarnings("serial")
public class creaUsuari extends request{
	private String Nom;
	private String Cognoms;
	private String Pass;
	private int Pasta;
	private String data_registre;
	private int aposta;

	public creaUsuari(){
		super(2);
	}

	public creaUsuari(String nom, String cognoms, String pass, int pasta, String data_registre) {
		super(2);
		Nom = nom;
		Cognoms = cognoms;
		Pass = pass;
		Pasta = pasta;
		this.data_registre = data_registre;
	}

	public String getNom() {
		return Nom;
	}

	public String getCognoms() {
		return Cognoms;
	}

	public String getPass() {
		return Pass;
	}

	public int getPasta() {
		return Pasta;
	}

	public String getData_registre() {
		return data_registre;
	}

	public int getAposta() {
		return aposta;
	}

}
