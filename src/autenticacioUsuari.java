package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class autenticacioUsuari extends request{
	private String id_user;
	private String pass;
	private boolean correcte;

	
	public boolean isCorrecte() {
		return correcte;
	}

	public void setCorrecte(boolean correcte) {
		this.correcte = correcte;
	}

	public autenticacioUsuari(){
		super(4);
	}
	
	public autenticacioUsuari (String id_user, String pass){
		super(4);
		this.id_user=id_user;
		this.pass=pass;	
	}
	
	public String getId_user() {
		return id_user;
	}
	
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}

}
	
