package com.hh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.mapper.EmployeeMapper;
import com.hh.pojo.Employee;
import com.hh.pojo.EmployeeExample;
import com.hh.pojo.EmployeeExample.Criteria;


@Service
public class EmployeeService {
	@Autowired
	EmployeeMapper employeeMapper; 
	/**
	 * 鏌ヨ鎵�鏈夊憳宸ワ紙鍒嗛〉鏌ヨ锛�
	 * @return
	 */
	public List<Employee> getAll() {
		return employeeMapper.selectByExampleWithDept(null);
	}
	/**
	 * 淇濆瓨鍛樺伐
	 * @param employee
	 */
	public void saveEmp(Employee employee) {
		employeeMapper.insertSelective(employee);
	}
	/**
	 * 鏍￠獙鐢ㄦ埛鍚嶆槸鍚﹁鍗犵敤
	 * @param empName
	 * @return
	 */
	public boolean checkuser(String empName) {
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmpNameEqualTo(empName);
		return employeeMapper.countByExample(example) == 0;
	}
	/**
	 * 淇敼鍛樺伐淇℃伅鐨勬椂鍊欑敤浜庢暟鎹洖鏄�
	 * @param id
	 * @return
	 */
	public Employee getEmp(Integer id) {
		 Employee employee = employeeMapper.selectByPrimaryKey(id);
		 return employee;
	}
	/**
	 * 淇敼鍛樺伐淇℃伅鐨勬彁浜�
	 * @param id
	 */
	public void updateEmp(Employee employee) {
		employeeMapper.updateByPrimaryKeySelective(employee);
	}
	/**
	 * 鍒犻櫎鍛樺伐淇℃伅
	 * @param id
	 */
	public void deleteEmp(Integer id) {
		employeeMapper.deleteByPrimaryKey(id);
	}
	/**
	 * 鎵归噺鍒犻櫎鍛樺伐
	 * @param strIds
	 */
	public void deleteBatchEmp(List<Integer> ids) {
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmpIdIn(ids);
		//delete from xxx where emp_id in (1,2,3);
		employeeMapper.deleteByExample(example);
	}
	/**
	 * 楂樼骇鎼滅储鍔熻兘
	 * @param employee
	 * @return
	 */
	public List<Employee> queryEmp(Employee employee) {
		// TODO Auto-generated method stub
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		System.out.println("".equals(employee.getEmpName()));
		if (!("".equals(employee.getEmpName()))) {
			criteria.andEmpNameEqualTo(employee.getEmpName());
		}
		if(!("".equals(employee.getEmail()))) {
			criteria.andEmailEqualTo(employee.getEmail());
		}
		criteria.andGenderEqualTo(employee.getGender());
		criteria.andDIdEqualTo(employee.getdId());
		
		return employeeMapper.selectByExampleWithDept(example);
	}
}
