package com.dev.web.controller.login;

import com.dev.core.dto.UserDTO;
import com.dev.core.service.IUserService;
import com.dev.core.service.impl.UserService;
import com.dev.web.core.utils.FormUtils;
import com.dev.web.logic.command.UserCommand;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ResourceBundle;

@WebServlet(urlPatterns = {"/login.html"})
public class LoginController extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());
    String view = "";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        String alert = req.getParameter("alert");
        String message = req.getParameter("message");
        if (alert!=null && message!=null){
            message = resourceBundle.getString(message);
            view = "/views/login/login.jsp?alert="+alert+"&message="+message;
        }else {
            view = "/views/login/login.jsp";
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher(view);
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserCommand userCommand = FormUtils.formToDTO(UserCommand.class,req);
        UserDTO userDTO = userCommand.getPojo();
        IUserService iUserService = new UserService();
        userDTO = iUserService.isUserExist(userDTO);
        if (userDTO.getId()>0){
            if (userDTO.getRoleDTO().getName().equalsIgnoreCase("admin")){
                view = "/admin-home.html";
            }else if (userDTO.getRoleDTO().getName().equalsIgnoreCase("user")){
                view = "/web-home.html";
            }
        }else{
            view = "/login.html?alert=danger&message=error";
        }
        resp.sendRedirect(view);
    }
}