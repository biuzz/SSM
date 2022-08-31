package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description:
 *
 * @author pt
 * @date 2022/8/29 18:27
 * @since JDK1.8
 */
public interface EmployeeMapper {

    List<Employee> getAllEmployee();

    void deleteEmployeeById(@Param("id") Integer id);

    Employee toUpdate(@Param("id") Integer id);

    void update(Employee employee);

    void insertEmployee(Employee employee);
}
