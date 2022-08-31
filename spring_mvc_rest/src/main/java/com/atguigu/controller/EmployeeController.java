package com.atguigu.controller;

import com.atguigu.dao.EmployeeDao;
import com.atguigu.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * 查询所有的员工信息-->/employee-->get
 * 跳转到添加页面-->/to/add-->get
 * 新增员工信息-->/employee-->post
 * 跳转到修改页面-->/employee/1-->get
 * 修改员工信息-->/employee-->put
 * 删除员工信息-->/employee/1-->delete
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;


    //查询所有员工信息
    @GetMapping("/employee")
    public String getAllEmp(Model model){
        System.out.println("查找所有");
        Collection<Employee> allEmployee = employeeDao.getAll();
        model.addAttribute("allEmployee",allEmployee);
        allEmployee.forEach(System.out::println);
        return "employee_list";
    }

    //先查询某个员工信息，回显
    @GetMapping("/employee/{id}")
    public String toUpdate(@PathVariable("id") Integer id,Model model){
        Employee emp = employeeDao.get(id);
        //将员工信息共享到请求域中
        model.addAttribute("emp",emp);
        return "employee_update";
    }



    //修改功能
    @PutMapping("/employee")
    public String updateEmp(Employee emp){
        System.out.println("修改");
        employeeDao.save(emp);
        //重定向到列表功能；/employee
        return "redirect:/employee";
    }

    @PostMapping("/employee")
    public String insertEmp(Employee emp){
        System.out.println("添加");
        employeeDao.save(emp);
        return "redirect:/employee";
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        System.out.println("删除"+id);
        employeeDao.delete(id);
        return "redirect:/employee";
    }
}
