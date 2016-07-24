package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class request implements Serializable{
	private int id;
	private int reconeixement;

	public request(){
		
	}
	
	public int getReconeixement() {
		return reconeixement;
	}

	public void setReconeixement(int reconeixement) {
		this.reconeixement = reconeixement;
	}

	public request(int reconeixement) {
		this.reconeixement = reconeixement;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}