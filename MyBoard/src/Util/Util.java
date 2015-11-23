package Util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class Util 
{
	public static void set_MessageBox(String msg, String location, HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html;charset=euc-kr");
	   		PrintWriter out=response.getWriter();
	   		out.println("<script>");
	   		out.println("alert('"+msg+"');");
	   		out.println("location.href='"+location+"';");
	   		out.println("</script>");
	   		out.close();
		}
		catch(Exception e){e.printStackTrace();}
	}
}
