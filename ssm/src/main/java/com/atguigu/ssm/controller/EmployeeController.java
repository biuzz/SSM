package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Description:
 *查询所有的员工信息-->/employee/-->get
 *查询员工的分页信息-->/employee/page/1-->get
 * 根据id查询员工信息-->/employee/1-->get
 * 跳转到添加页面-->/to/add-->get
 * 添加员工信息-->/employee-->post
 * 修改员工信息-->/employee-->put
 * 删除员工信息-->/employee/1-->delete
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    //查询员工的分页信息-->/employee/page/1-->get
    @RequestMapping(value = "/employee/page/{pageNum}",method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum,Model model){
        //获取员工的分页信息
        PageInfo<Employee> page=employeeService.getEmployeePage(pageNum);
        //将分页数据共享到请求域中
        model.addAttribute("page",page);
        return "employee_list";
    }

    //删除员工信息-->/employee/1-->delete
    @RequestMapping(value = "/employee/{id}/{pageNum}",method = RequestMethod.DELETE)
    public String deleteEmployeeById(@PathVariable("id") Integer id, @PathVariable("pageNum") Integer pageNum ){
        System.out.println("删除员工");
        employeeService.deleteEmployeeById(id);
        return "redirect:/employee/page"+"/"+pageNum;
    }


    //根据id查询员工信息-->/employee/1-->get,回显
    @RequestMapping(value = "/employee/{id}/{pageNum}",method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id") Integer id,Model model,@PathVariable("pageNum") Integer pageNum){
        Employee employee = employeeService.toUpdate(id);
        model.addAttribute("employee",employee);
        model.addAttribute("pageNum",pageNum);
        return "employee_update";
    }

    //修改员工信息-->/employee-->put
    @RequestMapping(value = "/employee/{pageNum}",method = RequestMethod.PUT)
    public String Update(Employee employee,@PathVariable("pageNum") Integer pageNum){
        employeeService.update(employee);
        return "redirect:/employee/page/"+pageNum;
    }

    //带总页数跳转到添加页面
    @RequestMapping(value = "/to/add/{pages}",method = RequestMethod.GET)
    public String toAdd(@PathVariable("pages") Integer pages,Model model){
        model.addAttribute("pages",pages);
        return "employee_add";
    }

    // * 添加员工信息-->/employee-->post
    @RequestMapping(value = "/employee/{pages}",method = RequestMethod.POST)
    public String insertEmployee(Employee employee,@PathVariable("pages" )Integer pages){
        System.out.println("添加员工操作！");
        System.out.println(1);
        employeeService.insertEmployee(employee);
        return "redirect:/employee/page/"+pages;
    }




//    @RequestMapping(value = "/employee",method = RequestMethod.GET)
//    public String getAllEmployee(Model model){
//        List<Employee> list=employeeService.getAllEmployee();
//        //将员工信息在请求域中共享
//        model.addAttribute("list",list);
//        //跳转到employee_list.html
//        return "employee_list";
//    }

}
