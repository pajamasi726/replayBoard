package Member.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Interface.Action;
import Interface.ActionForward;
import Member.DATO.MemberDAO;
import Member.DATO.MemberDTO;
import Util.Util;

/**
 * ȸ�� ������ ó�� �ϴ� Ŭ����
 * @author Administrator
 */
public class JoinAction implements Action 
{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		// ���� ��ü �غ� 
		ActionForward forward = null; // null �� ó�� �ϴ� ������ , ȸ�� ����/���� �� response�� ������ �� �̱� ������
		
		// ����� �Է� ���� �޾ƿ���
		String 	id 		= request.getParameter("id");
		String 	pass 	= request.getParameter("pass");
		String 	name	= request.getParameter("name");
		int			age	= Integer.parseInt(request.getParameter("age"));
		String		address	= request.getParameter("address");
		String		ph1		= request.getParameter("ph1");
		String		ph2		= request.getParameter("ph2");	
		String		ph3		= request.getParameter("ph3");
		String		phone	= ph1+"-"+ph2+"-"+ph3;
		String		hobby	= request.getParameter("hobby");
		
		// ����� ��ü ����
		MemberDTO dto = new MemberDTO(id, pass, name, age, address, phone, hobby);
		
		// ȸ�� ���� ó��
		boolean joinCheck = MemberDAO.joinMember(dto);
		
		if(joinCheck) // ȸ�� ������ �Ǿ����� 
		{
			/** ȸ�� ���� ����, �α��� ������ ���� ������ ���� �Ѵ�. */
			// ���� ��������
			HttpSession session = request.getSession();
			// ����� ���� ����
			session.setAttribute("member", dto);
			
			// ȸ�� ���� ���� �˸��� ���� �ּ� ����
			Util.set_MessageBox("ȸ�� ������ �Ǿ����ϴ�.", "./index.jsp", response);
		}
		else // ȸ�� ������ �ȵǾ�����
		{
			// ȸ�� ���� ���� �˸���
			Util.set_MessageBox("ȸ���� ���� �Ͽ����ϴ�.", "./index.jsp", response);
		}
		
		return forward;
	}

}
