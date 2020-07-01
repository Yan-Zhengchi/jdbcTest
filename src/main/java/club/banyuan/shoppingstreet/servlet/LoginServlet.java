package club.banyuan.shoppingstreet.servlet;

import club.banyuan.shoppingstreet.domain.User;
import club.banyuan.shoppingstreet.service.IUserService;
import club.banyuan.shoppingstreet.service.Impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/loginServlet.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        IUserService userService = new UserServiceImpl();
        User user = userService.login(userName, password);
        if(user!=null){
            resp.sendRedirect("loginOK.jsp");
        }else{
            resp.getWriter().write("登陆失败");
        }
    }
}
