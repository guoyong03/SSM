package com.mybatis.controller;

import com.mybatis.model.Employee;
import com.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/query")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @RequestMapping("/queryEmployees")
  public ModelAndView queryEmployees()throws Exception{
    List<Employee> employees = employeeService.getEmployees();

    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("employees", employees);
    modelAndView.setViewName("list"); //指定jsp页面 /webapp/WEB_INF/views/list.jsp
    return modelAndView;
  }

}