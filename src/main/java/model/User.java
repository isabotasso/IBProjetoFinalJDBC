package model;

public class User {
	
	private Integer id;
	private String nome;
	private String pais;
	private String email;

	public User(String email, String nome, String pais) {
		this.email = email;
		this.nome = nome;
		this.pais = pais;
		
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getPais() {
		return this.pais;
	}
	
	public String toString() {
		return this.id + " - " + this.nome + " - " + this.email + " - " + this.pais; 
	}
}
