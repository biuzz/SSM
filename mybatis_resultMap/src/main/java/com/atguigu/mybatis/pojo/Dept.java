package com.atguigu.mybatis.pojo;

import java.util.List;

/**
 * Description:
 *
 * @author pt
 * @date 2022/8/18 17:06
 * @since JDK1.8
 */
public class Dept {

    private Integer deptId;

    private String deptName;

    private List<Emp> emps;

    public Dept(Integer deptId, String deptName, List<Emp> emps) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.emps = emps;
    }

    public Dept() {
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }
}
