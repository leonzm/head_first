package com.company.chapter_09;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工类
 * 含基本信息及下级员工的连接
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    /**
     * 追加下级员工
     * @param employee
     */
    public void add(Employee employee) {
        subordinates.add(employee);
    }

    /**
     * 移除下级员工
     * @param employee
     */
    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    /**
     * 获取下级员工集合
     * @return
     */
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }

}
