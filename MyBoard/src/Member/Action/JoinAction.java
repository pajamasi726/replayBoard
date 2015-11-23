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
 * 회원 가입을 처리 하는 클래스
 * @author Administrator
 */
public class JoinAction implements Action 
{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		// 리턴 객체 준비 
		ActionForward forward = null; // null 로 처리 하는 이유는 , 회원 가입/실패 후 response를 조작할 것 이기 때문에
		
		// 사용자 입력 정보 받아오기
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
		
		// 사용자 객체 생성
		MemberDTO dto = new MemberDTO(id, pass, name, age, address, phone, hobby);
		
		// 회원 가입 처리
		boolean joinCheck = MemberDAO.joinMember(dto);
		
		if(joinCheck) // 회원 가입이 되었을때 
		{
			/** 회원 가입 정보, 로그인 정보는 세션 영역에 저장 한다. */
			// 세션 가져오기
			HttpSession session = request.getSession();
			// 사용자 정보 지정
			session.setAttribute("member", dto);
			
			// 회원 가입 성공 알리기 리턴 주소 지정
			Util.set_MessageBox("회원 가입이 되었습니다.", "./index.jsp", response);
		}
		else // 회원 가입이 안되었을때
		{
			// 회원 가입 실패 알리기
			Util.set_MessageBox("회원에 실패 하였습니다.", "./index.jsp", response);
		}
		
		return forward;
	}

}
