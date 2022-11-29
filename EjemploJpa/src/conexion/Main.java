package conexion;

import java.sql.*;

public class Main {
	
public static void main(String[] args) {
	System.out.println("conexion exitosa");
	System.out.println("Se ha conectado");
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="yy12345";
		String query="SELECT*FROM EMPLOYEES";
		
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(query);
			while(rs.next()){
				System.out.println("ID:"+rs.getInt(1)+ " NOMBRE: "+rs.getString(2)+" APELLIDO: "+rs.getString(3));
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}