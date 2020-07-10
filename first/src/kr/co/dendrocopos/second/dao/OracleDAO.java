package kr.co.dendrocopos.second.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDAO {

	public Connection getConn() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, userName, password);
		System.out.println("접속성공");
		return conn;
	}

	public void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("접속종료");
		}
	}

	//싱글톤 구현
	private static OracleDAO temp = null;
	private OracleDAO() {}
	public static OracleDAO getInstance() {
		if (temp == null) {
			temp = new OracleDAO();
			}
		return temp;
	}
	
	public static void main(String[] args) {
		OracleDAO dao = OracleDAO.getInstance();
		Connection conn = null;
		try {
			conn = dao.getConn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao.closeConn(conn);
	}

}
