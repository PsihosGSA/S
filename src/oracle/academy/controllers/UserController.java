package oracle.academy.controllers;

import oracle.academy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class UserController  {

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String gotoHello(@RequestHeader("User-Agent") String aggent){
        System.out.println(aggent);
        return "hello";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public void addUserGet(HttpServletRequest request, HttpServletResponse response){
        addUser(request,response);
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(HttpServletRequest request, HttpServletResponse response){
        request.getParameter("fistName");
    }



}
