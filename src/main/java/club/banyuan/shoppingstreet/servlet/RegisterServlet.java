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

@WebServlet("/RegisterServlet.do")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setUserName(req.getParameter("userName"));
        user.setLoginName(req.getParameter("loginName"));
        user.setPassword(req.getParameter("password"));
        user.setSex(Integer.valueOf(req.getParameter("sex")));
        user.setIdentityCode(req.getParameter("identityCode"));
        user.setEmail(req.getParameter("email"));
        user.setMobile(req.getParameter("mobile"));
        user.setType(Integer.valueOf(req.getParameter("type")));
        IUserService userService = new UserServiceImpl();
        int i = userService.register(user);
        if(i>0){
            resp.sendRedirect("registerOK.jsp");
        }else{
            resp.getWriter().write("注册失败！！！！！");
        }

    }
}
