package etu;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EtudiantManager {
	public int addEtudiant(String E_name, String E_email, String E_password) 
	{
		
				
		DBinteraction.connect();
		String sql="insert into Etudiant(E_name,E_email,E_password) values ('"+E_name+"','"+E_email+"','"+E_password+"');";
		int nb=DBinteraction.Maj(sql);
		DBinteraction.disconnect();
				
			return nb;	 
				
	}
	
	public int addEtudiant(Etudiant e) 
	{
		
				
		DBinteraction.connect();
		String sql="insert into Etudiant(E_name,E_email,E_password) values ('"+e.getE_name()+"','"+e.getE_email()+"','"+e.getE_password()+"');";
		int nb=DBinteraction.Maj(sql);
		DBinteraction.disconnect();
		
		System.out.println("Etudiant bien ajouter");
				
			return nb;	 
				
	}
	public int deleteEtudiant(int idEtudiant) 
	{
				DBinteraction.connect();
				int nb=DBinteraction.Maj("delete from Etudiant where idEtudiant="+idEtudiant);
				DBinteraction.disconnect();
				
				return nb;
	}
	
	public Etudiant findEtudiantById(int idEtudiant)
	{
		Etudiant e1=null;
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from Etudiant where idEtudiant="+idEtudiant);
		try {
			if(rs.next())
			{
				e1=new Etudiant();
				e1.setIdEtudiant(rs.getInt(1));
				e1.setE_name(rs.getString(2));
				e1.setE_email(rs.getString(3));
				e1.setE_password(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return e1;
	}
	
	public int updateEtudiant(int idEtudiant,Etudiant et)
	{
		DBinteraction.connect();
		String sql="update Etudiant set E_name='"+et.getE_name()+"', E_email='"+et.getE_email()+"' , E_password='"+et.getE_password()+"' where idEtudiant="+idEtudiant;
		int nb=DBinteraction.Maj(sql);
		DBinteraction.disconnect();
		return nb;
		
	}
	
	
	public List<Etudiant> allEtudiant()
	{
		List<Etudiant> es=new ArrayList<Etudiant>();
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from Etudiant");
		try {
			while(rs.next())
			{
				Etudiant e2=new Etudiant();
				e2.setIdEtudiant(rs.getInt(1));
				e2.setE_name(rs.getString(2));
				e2.setE_email(rs.getString(3));
				e2.setE_password(rs.getString(4));
				//ajouter u dans la liste
				es.add(e2);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return es;
		
	}
	
	public Etudiant authentification(String E_email, String E_password)
	{
		Etudiant e1=null;
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from Etudiant where E_email='"+E_email+"' and E_password='"+E_password+"'");
		try {
			if(rs.next())
			{
				e1=new Etudiant();
				e1.setIdEtudiant(rs.getInt(1));
				e1.setE_name(rs.getString(2));
				e1.setE_password(rs.getString(3));
				e1.setE_password(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return e1;
		
	}

}
