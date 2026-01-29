package j0129_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C05 {

	//C:\oracle21\dbhomeXE\jdbc\lib
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "ora_user";
		String password = "1111";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 로드 (Java 8 이하는 필수)
			// oracle.jdbc.driver.OracleDriver 클래스 정보를 가져오는 class.forname
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 2. DB 연결
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("오라클 DB 연결 성공!");
            
            String query = "select * from member";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();
            
            while(rs.next()) {
            	String id = rs.getString("id");
            	String pw = rs.getString("pw");
            	String name = rs.getString("name");
            	System.out.printf("%s,%s,%s\n",id,pw,name);
            }
			
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			
			try {
	            // 3. 연결 종료				
				rs.close();
				pstmt.close();
	            conn.close();
	            
	            System.out.println("오라클 DB 연결 종료!");
	            
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
