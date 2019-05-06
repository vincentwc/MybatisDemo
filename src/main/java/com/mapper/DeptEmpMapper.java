package com.mapper;

import com.entity.DeptEmp;

import java.util.List;

//mapper接口
public interface DeptEmpMapper {

    List<DeptEmp> getEmpTotalByDept();
}
