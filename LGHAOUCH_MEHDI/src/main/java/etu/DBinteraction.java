package etu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBinteraction {

		static String url;
		static Connection con;
		static Statement st;
		
		public static void connect()
		{
					
					try {
						
						Class.forName("com.mysql.jdbc.Driver");
						url="jdbc:mysql://localhost/biblio";
						  con = DriverManager.getConnection(url, "root", "");
						  st = con.createStatement();
					
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				
			
		}
		public static int Maj(String sql)
		{
			int nb = 0;
			try {
				nb = st.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return nb;
			
		}
		public static ResultSet select(String sql)
		{
			ResultSet res = null;
			try {
				res = st.executeQuery(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return res;
		}
		public static void disconnect()
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

}
