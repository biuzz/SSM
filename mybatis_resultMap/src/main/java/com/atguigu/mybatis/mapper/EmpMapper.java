package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    /**
    * Description:根据id查询员工信息
    * @author pt
    * @date 2022/8/18 17:12
    * @since JDK 1.8
    */
    Emp getEmpByEmpId(@Param("empId") Integer empId);


    /**
    * Description:获取员工以及所对应的部门信息
    * @author pt
    * @date 2022/8/18 17:59
    * @since JDK 1.8
    */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
    * Description:通过分步查询员工以及所对应的部门信息的第一步
    * @author pt
    * @date 2022/8/19 0:36
    * @since JDK 1.8
    */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);


    /**
    * Description:通过分步查询查询部门以及部门中的员工信息的第二步
    * @author pt
    * @date 2022/8/19 18:39
    * @since JDK 1.8
    */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
