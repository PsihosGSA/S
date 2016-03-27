package ua.org.oa.gavrishs.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ua.org.oa.gavrishs.exceptions.AppException;
import ua.org.oa.gavrishs.model.User;
import ua.org.oa.gavrishs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.OK;

/**
 * Created by Oleg on 15.02.2016.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getUserList(ModelMap model){

        model.put("usersList", userService.getUsersList());

        return "userList";
    }

    @RequestMapping(path = "/add", method = RequestMethod.GET)
    public String getUserAddForm(ModelMap model){
        return "addUser";
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public String submitUserAddForm(ModelMap model){
        return "addUser";
    }

    @RequestMapping(path = "/edit/{userId}", method = RequestMethod.GET)
    public String getUserEditForm(ModelMap model, @PathVariable long userId){
        System.out.println(userId);
        return "addUser";
    }

    @RequestMapping(path = "/edit/{userId}", method = RequestMethod.POST)
    public String getUserEditSubmit(ModelMap model, @PathVariable long userId){

        System.out.println(userId);
        return "addUser";
    }

    @RequestMapping(path = "/delete/{userId}", method = RequestMethod.GET)
    public String getUserDelete(ModelMap model, @PathVariable long userId){
        System.out.println(userId);
        return "addUser";
    }


    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsersJSON(HttpServletRequest request) {
        try {
            return new ResponseEntity<>(userService.getUsersList(), OK);
        } catch (AppException e){

            // TODO: добавить логгирование
            e.printStackTrace();

            return new ResponseEntity<>(e.getLocalizedMessage(), INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getPageUsers(ModelMap model) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String users = mapper.writeValueAsString(userService.getUsersList());
        model.put("initialUsersList", users);
        return "users";
    }

    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public List<User> getPageUsersJSON() {
        return userService.getUsersList();
    }

}