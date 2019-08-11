package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;

import util.JdbcUtil;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext servletContext=null;;

	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) throws ServletException {
		servletContext = config.getServletContext();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String school = request.getParameter("school");
		String college = request.getParameter("college");
		String specialty = request.getParameter("specialty");
		String name = request.getParameter("name");
		String num = request.getParameter("num");
		String gender = request.getParameter("gender");
		String tele = request.getParameter("tele");
		String qq = request.getParameter("qq");
		System.out.println(school);
		System.out.println(gender);
		if (school.equals("m"))
			school = "张家港校区";
		else
			school = "苏州理工学院";
		if (gender.equals("m"))
			gender = "男";
		else
			gender = "女";
		System.out.println(school);
		System.out.println(college);
		System.out.println(specialty);
		System.out.println(name);
		System.out.println(num);
		System.out.println(gender);
		System.out.println(tele);
		System.out.println(qq);
		String sql = "insert into stu(school,college,specialty,name,num,gender,tele,qq) value(?,?,?,?,?,?,?,?)";
		try {
			QueryRunner qr = new QueryRunner(JdbcUtil.getDs());
			qr.update(sql, school, college, specialty, name, num, gender, tele, qq);
			response.setCharacterEncoding("UTF-8");
			response.setHeader("Content-Type", "text/html;charset=UTF-8");
//			response.getWriter().write("提交成功");
			response.sendRedirect("http://localhost:8080/NetworkClub/index.html");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
