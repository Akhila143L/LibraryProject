package com.infinite.LibraryProj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryDAO {

	public int authenticate(String user, String  password) throws ClassNotFoundException, SQLException{
		Connection  connection = ConnectionHelper.getConnection();
		String  cmd="select count(*) cnt from libusers where UserName=? and password=?";
		PreparedStatement pst=connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setString(2, password);
		ResultSet rs=pst.executeQuery();
		rs.next();
		int count=rs.getInt("cnt");
		return count;
		
	}
}
