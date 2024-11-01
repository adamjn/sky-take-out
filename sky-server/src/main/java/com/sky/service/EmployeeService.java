package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     *
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     *
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 分页查询
     *
     * @param employeePageQueryDTO
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);


    /**
     * 启用或禁用员工
     *
     * @param status 状态 0：禁用 1：启用
     * @param id     员工id
     **/

    void startOrStop(Integer status, Long id);

    /**
     * 根据id查询员工信息
     *
     * @param id 员工id
     * @return
     */
    Employee getEmployeeById(Long id);

    /**
     * 编辑员工信息
     *
     * @param employeeDTO
     * @return
     */
    void update(EmployeeDTO employeeDTO);
}
