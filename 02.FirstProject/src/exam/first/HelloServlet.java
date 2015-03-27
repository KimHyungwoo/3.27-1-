package exam.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")    //URL Mapping
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); // 이름에 홍길동(한글)을 인식해서 안깨짐
		response.setContentType("text/html; charset=UTF-8"); // 이름 << (한글)이 안깨짐 
		
		PrintWriter out = response.getWriter();
		
		String name1 = request.getParameter("name2");
		String id1 = request.getParameter("id2");
		String password1 = request.getParameter("pwd2");
		
/*		out.println("Hello - GET");
		out.println(name1);
		out.println(id1);
		out.println(password1);*/
		
		//out.print("<html>");
		out.print("Hello - GET<br>");
		out.print("이름 : " + name1 + "<br>");
		//out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); // 이름에 홍길동(한글)을 인식해서 안깨짐
		response.setContentType("text/html; charset=UTF-8"); // 이름 << (한글)이 안깨짐  
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("pwd");
/*		
		out.println("Hello - POST");
		out.println(name);
		out.println(id);
		out.println(password);*/
		
		//out.print("<html>");
		out.print("Hello - POST<br>");
		out.print("이름 : " + name + "<br>");
		//out.print("</html>");
	}

}
