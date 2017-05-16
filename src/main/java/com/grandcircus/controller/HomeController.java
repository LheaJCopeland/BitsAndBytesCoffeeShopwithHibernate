package com.grandcircus.controller;

import com.test.models.UsersEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("welcome","message","Welcome to Bits and Bytes Coffee Shop!");

    }

    @RequestMapping("/listCustomers")
    public ModelAndView listCustomers() {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFact = cfg.buildSessionFactory();
        Session selectCustomers = sessionFact.openSession();
        selectCustomers.beginTransaction();
        Criteria c = selectCustomers.createCriteria(UsersEntity.class);
        ArrayList<UsersEntity> customerList = (ArrayList<UsersEntity>) c.list();
        return new ModelAndView("page2", "cList", customerList);

    }
}