package liv;

public class Livre {
	int idLivre;
	String L_Name,L_Auteur,L_Categ;
	public int getIdLivre() {
		return idLivre;
	}
	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}
	public String getL_Name() {
		return L_Name;
	}
	public void setL_Name(String l_Name) {
		L_Name = l_Name;
	}
	public String getL_Auteur() {
		return L_Auteur;
	}
	public void setL_Auteur(String l_Auteur) {
		L_Auteur = l_Auteur;
	}
	public String getL_Categ() {
		return L_Categ;
	}
	public void setL_Categ(String l_Categ) {
		L_Categ = l_Categ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
