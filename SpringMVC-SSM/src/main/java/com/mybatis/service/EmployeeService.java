package com.mybatis.service;
import com.mybatis.model.Employee;
import java.util.List;
/**
 * Created by guoyong03 on 2017/5/29.
 */
public interface EmployeeService {
  Employee getEmployee(int id);

  List<Employee> getEmployees();
}
