package etu;

public class Etudiant {
	int idEtudiant;
	String E_name,E_email,E_password;
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public String getE_email() {
		return E_email;
	}
	public void setE_email(String e_email) {
		E_email = e_email;
	}
	public String getE_password() {
		return E_password;
	}
	public void setE_password(String e_password) {
		E_password = e_password;
	}
	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", E_name=" + E_name + ", E_email=" + E_email + ", E_password="
				+ E_password + "]";
	}
	

}
