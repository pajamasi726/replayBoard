package Member.DATO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import DB.DBManager;

/**
 * Member���� Data Access Object ó�� 
 * @author Administrator
 */
public class MemberDAO 
{

	/** ȸ�� ������ ó�� �ϴ� �޼ҵ�*/
	public static boolean joinMember(MemberDTO dto) 
	{
		// ȸ�� ���� ���� üũ
		boolean joinCheck = false; 
		
		// DB ���� �ڿ�
		Connection conn 				= DBManager.get_DB_Connection();
		PreparedStatement pstmt 	= null;
		
		// ������ 
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
			
			// age int ������ ���� �Ѵ�.
			pstmt.setObject(4, dto.getAge(), Types.INTEGER);
			
			// address
			pstmt.setObject(5, dto.getAddress(), Types.VARCHAR);
			
			// phone
			pstmt.setObject(6, dto.getPhone(), Types.VARCHAR);
			
			// ������Ʈ 
			int n=pstmt.executeUpdate();

			// ��� ������ Ȯ��
			if(n>0)
			{
				joinCheck = true;
			}
			
		}// try end
		catch(SQLException e){e.printStackTrace();}
		finally // ��� �۾��� ������ �ڿ� �ݳ� 
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
