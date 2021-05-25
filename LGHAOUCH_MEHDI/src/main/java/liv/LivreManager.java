package liv;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import etu.DBinteraction;

	
	public class LivreManager {
		public int addLivre(String L_Name, String L_Auteur, String L_Categ) 
		{
			DBinteraction.connect();
			String sql="insert into Livre(L_Name,L_Auteur,L_Categ) values ('"+L_Name+"','"+L_Auteur+"','"+L_Categ+"')";
			int nb=DBinteraction.Maj(sql);
			DBinteraction.disconnect();
					
				return nb;	 
					
		}
		
		public int deleteLivre(int idLivre) 
		{
					DBinteraction.connect();
					int nb=DBinteraction.Maj("delete from Livre where idLivre="+idLivre);
					DBinteraction.disconnect();
					
					return nb;
		}
		
		public Livre findLivreById(int idLivre)
		{
			Livre l=null;
			DBinteraction.connect();
			ResultSet rs = DBinteraction.select("select * from Livre where idLivre="+idLivre);
			try {
				if(rs.next())
				{
					l=new Livre();
					l.setIdLivre(rs.getInt(1));
					l.setL_Name(rs.getString(2));
					l.setL_Auteur(rs.getString(3));
					l.setL_Categ(rs.getString(4));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return l;
		}
		
		public int updateLivre(int idLivre,Livre lt)
		{
			DBinteraction.connect();
			String sql="update Livre set L_Name='"+lt.getL_Name()+"', L_Auteur='"+lt.getL_Auteur()+"' , L_Categ='"+lt.getL_Categ()+"' where idLivre="+idLivre;
			int nb=DBinteraction.Maj(sql);
			DBinteraction.disconnect();
			return nb;
			
		}
		
		
		public List<Livre> allLivre()
		{
			List<Livre> ls=new ArrayList<Livre>();
			DBinteraction.connect();
			ResultSet rs = DBinteraction.select("select * from Livre");
			try {
				while(rs.next())
				{
					Livre l=new Livre();
					l.setIdLivre(rs.getInt(1));
					l.setL_Name(rs.getString(2));
					l.setL_Auteur(rs.getString(3));
					l.setL_Categ(rs.getString(4));
					//ajouter u dans la liste
					ls.add(l);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ls;
			
		}

}
