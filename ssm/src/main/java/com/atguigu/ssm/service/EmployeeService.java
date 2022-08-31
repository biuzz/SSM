package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {

    /**
    * Description:查询所有员工信息
    * @author pt
    * @date 2022/8/30 15:15
    * @since JDK 1.8
    */
    List<Employee> getAllEmployee();

    /**
    * Description:获取员工分页信息
    * @author pt
    * @date 2022/8/30 17:01
    * @since JDK 1.8
    */
    PageInfo<Employee> getEmployeePage(Integer pageNum);

    void deleteEmployeeById(Integer id);

    Employee toUpdate(Integer id);

    void update(Employee employee);

    void insertEmployee(Employee employee);
}
