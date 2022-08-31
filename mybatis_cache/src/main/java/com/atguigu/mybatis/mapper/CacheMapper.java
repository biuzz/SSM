package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {

    /**
    * Description:  根据员工id查询员工信息
    * @author pt
    * @date 2022/8/20 14:37
    * @since JDK 1.8
    */
    Emp getEmpById(@Param("empId") Integer empId);


    /**
    * Description:添加员工信息
    * @author pt
    * @date 2022/8/20 15:00
    * @since JDK 1.8
    */
    void insertEmp(Emp emp);
}
