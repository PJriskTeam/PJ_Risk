package main;

import java.io.IOException;

public class loginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws Exception  {
		String username = request.getParameter("username");// 取得用户名
		String password = request.getParameter("password");// 取得密码
		System.out.println("取得用户名和密码");
		 
		LoginSuccess db = new LoginSuccess(); // 构建登陆对象
		boolean canLogin = db.LoginSuccess(username, password);// 取得用户名和密码
		if (canLogin) {// 根据登陆情况，跳转页面
			System.out.println("用户名和密码正确");
			response.sendRedirect("login_success.jsp");
		} else {
			response.sendRedirect("login_failed.jsp");
			System.out.println("用户名和密码错误");
		}
	}
	public void destroy() {
	}
	public ServletConfig getServletConfig() {
		return null;
	}
	public String getServletInfo() {
		return null;
	}
	public void init(ServletConfig arg0) throws ServletException {
	}
 
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		HttpServletRequest rq = (HttpServletRequest) request;
		HttpServletResponse rs = (HttpServletResponse) response;
		try {
			doPost(rq, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
