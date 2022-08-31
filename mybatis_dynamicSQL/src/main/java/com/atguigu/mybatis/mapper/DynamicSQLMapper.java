package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description:
 *
 * @author pt
 * @date 2022/8/19 20:49
 * @since JDK1.8
 */
public interface DynamicSQLMapper {


    /**
    * Description:
    * @author pt
    * @date 2022/8/19 20:54
    * @since JDK 1.8
    */
    List<Emp> getEmpByCondition(Emp emp);


    /**
    * Description:使用choose查询员工信息
    * @author pt
    * @date 2022/8/20 1:17
    * @since JDK 1.8
    */
    List<Emp> getEmpByChoose(Emp emp);


    /**
    * Description:批量添加员工信息
    * @author pt
    * @date 2022/8/20 1:30
    * @since JDK 1.8
    */
    void insertMoreEmp(@Param("emps") List<Emp> emps);


    /**
    * Description:批量删除
    * @author pt
    * @date 2022/8/20 12:18
    * @since JDK 1.8
    */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);

}
