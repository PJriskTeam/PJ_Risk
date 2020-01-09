package com.hh.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hh.pojo.Employee;
import com.hh.pojo.EmployeeExample;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer empId);
    //鏂板鍔犵殑2涓柟娉曪紝鐢ㄤ簬鏌ヨ鍛樺伐鐨勬椂鍊欐牴鎹憳宸ョ殑d_id鏌ヨ鏄剧ず鍑洪儴闂ㄥ悕绉�
    List<Employee> selectByExampleWithDept(EmployeeExample example);

    Employee selectByPrimaryKeyWithDept(Integer empId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}