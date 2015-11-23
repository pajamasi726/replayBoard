package Member.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ControllerDefine.ControllerDefine;
import Interface.Action;
import Interface.ActionForward;
import Member.Action.JoinAction;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/Member")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 한글 인코딩 설정
		request.setCharacterEncoding("euc-kr");
		
		// 페이지 정보 처리 객체 
		ActionForward forward=null;
		Action action=null;
		 
		// 명령어 받아오기
		String cmd = request.getParameter("cmd");
		System.out.println("명령어 : "+cmd);

		switch(cmd)
		{
			case ControllerDefine.MemberJoinForm : // 회원 가입 form 요청 
				//request로 page 정보만 넘겨주면 되기 때문에 sendredirect로 처리 
				forward=new ActionForward();
				forward.setRedirect(true); // request로 인자만 넘겨 주면 되므로 true
				forward.setPath("./index.jsp?page=./Member/JoinForm.jsp");
			break;
			
			case ControllerDefine.MemberJoin : // 회원 가입 처리 
				// DB에 접근 해서 처리 하고, Object로 넘겨 주므로 dispatcher
				action = new JoinAction();
				try
				{
					forward=action.execute(request, response);
				}
				catch(Exception e){ e.printStackTrace();}
			break;
			
		}// switch end
		
		// 결과 처리
		if(forward != null)
		{
			if(forward.isRedirect())
			{
				response.sendRedirect(forward.getPath());
			}
			else
			{
				RequestDispatcher dispatcher=request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}// null if end
	}// service end

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
