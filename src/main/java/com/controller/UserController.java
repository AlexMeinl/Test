package com.controller;

import com.model.User;
import com.service.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {
    private ServiceBase serviceBase;

    @Autowired
    @Qualifier(value = "serviceBase")
    public void setServiceBase(ServiceBase serviceBase) {
        this.serviceBase = serviceBase;
    }

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public String listUsers(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("listUsers", this.serviceBase.listUsers());

        return "users";
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user){
        if(user.getId() == 0){
            this.serviceBase.addUser(user);
        }else {
            this.serviceBase.updateUser(user);
        }

        return "redirect:/users";
    }

    @RequestMapping("/remove/{id}")
    public String removeUser(@PathVariable("id") int id){
        this.serviceBase.removeUser(id);

        return "redirect:/users";
    }

    @RequestMapping("edit/{id}")
    public String editUser(@PathVariable("id") int id, Model model){
        model.addAttribute("user", this.serviceBase.getUserById(id));
        model.addAttribute("listUsers", this.serviceBase.listUsers());

        return "users";
    }

    @RequestMapping(value = "/users/search", method = RequestMethod.POST)
    public String searchUserByName(@ModelAttribute("user") User user, Model model) {
        List<User> users = this.serviceBase.getUserByName(user.getName());
        model.addAttribute("listUsers", users);
        return "resultsearch";
    }
}
