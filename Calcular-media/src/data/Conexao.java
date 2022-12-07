package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
	private String url;
	private String bd;
	private String bdName;
	private String userName;
	private String userPassword;
	private String host;
	private String port;
	private Connection con;

	public Conexao(String bd, String host, String port, String bdName, String userName, String userPassword) {
		super();
		this.bd = bd;
		this.host = host;
		this.port = port;
		this.bdName = bdName;
		this.userName = userName;
		this.userPassword = userPassword;
		this.url = "jdbc:" + bd + "://" + host + ":" + port + "/" + bdName;
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, userName, userPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
