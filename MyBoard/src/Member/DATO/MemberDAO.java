package Member.DATO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import DB.DBManager;

/**
 * Member관련 Data Access Object 처리 
 * @author Administrator
 */
public class MemberDAO 
{

	/** 회원 가입을 처리 하는 메소드*/
	public static boolean joinMember(MemberDTO dto) 
	{
		// 회원 가입 여부 체크
		boolean joinCheck = false; 
		
		// DB 연결 자원
		Connection conn 				= DBManager.get_DB_Connection();
		PreparedStatement pstmt 	= null;
		
		// 쿼리문 
		StringBuffer SQL = new StringBuffer();
		SQL.append("Insert into member");
		SQL.append(" values (?,?,?,?,?,?)");
		
		try
		{
			pstmt=conn.prepareStatement(SQL.toString());

			// id
			pstmt.setObject(1, dto.getId(), Types.VARCHAR);

			// pass
			pstmt.setObject(2, dto.getPass(), Types.VARCHAR);

			// name
			pstmt.setObject(3, dto.getName(), Types.VARCHAR);
			
			// age int 형으로 지정 한다.
			pstmt.setObject(4, dto.getAge(), Types.INTEGER);
			
			// address
			pstmt.setObject(5, dto.getAddress(), Types.VARCHAR);
			
			// phone
			pstmt.setObject(6, dto.getPhone(), Types.VARCHAR);
			
			// 업데이트 
			int n=pstmt.executeUpdate();

			// 결과 갯수로 확인
			if(n>0)
			{
				joinCheck = true;
			}
			
		}// try end
		catch(SQLException e){e.printStackTrace();}
		finally // 모든 작업이 끝난후 자원 반납 
		{
			try
			{
				if(conn!=null)conn.close();
				if(pstmt!=null)pstmt.close();
			}catch(Exception e){e.printStackTrace();}
		}
		
		return joinCheck;
	}

}
