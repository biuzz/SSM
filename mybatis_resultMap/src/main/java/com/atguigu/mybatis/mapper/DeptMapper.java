package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
    * Description:通过分步查询员工以及所对应的部门信息的第二步
    * @author pt
    * @date 2022/8/19 0:47
    * @since JDK 1.8
    */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);


    /**
    * Description:查询部门以及部门中的员工信息
    * @author pt
    * @date 2022/8/19 15:48
    * @since JDK 1.8
    */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);


    /**
    * Description:通过分步查询查询部门以及部门中的员工信息的第一步
    * @author pt
    * @date 2022/8/19 18:27
    * @since JDK 1.8
    */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
