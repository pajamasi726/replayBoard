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
		
		// �ѱ� ���ڵ� ����
		request.setCharacterEncoding("euc-kr");
		
		// ������ ���� ó�� ��ü 
		ActionForward forward=null;
		Action action=null;
		 
		// ��ɾ� �޾ƿ���
		String cmd = request.getParameter("cmd");
		System.out.println("��ɾ� : "+cmd);

		switch(cmd)
		{
			case ControllerDefine.MemberJoinForm : // ȸ�� ���� form ��û 
				//request�� page ������ �Ѱ��ָ� �Ǳ� ������ sendredirect�� ó�� 
				forward=new ActionForward();
				forward.setRedirect(true); // request�� ���ڸ� �Ѱ� �ָ� �ǹǷ� true
				forward.setPath("./index.jsp?page=./Member/JoinForm.jsp");
			break;
			
			case ControllerDefine.MemberJoin : // ȸ�� ���� ó�� 
				// DB�� ���� �ؼ� ó�� �ϰ�, Object�� �Ѱ� �ֹǷ� dispatcher
				action = new JoinAction();
				try
				{
					forward=action.execute(request, response);
				}
				catch(Exception e){ e.printStackTrace();}
			break;
			
		}// switch end
		
		// ��� ó��
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
