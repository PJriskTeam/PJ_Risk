package com.hh.repository;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hh.bean.Project;
@Mapper
public interface ProjectMapper {

	public void  add1(Project  p);
	
	public List<Project>  getproject(@Param("PROJECT_NO")int PROJECT_NO);
	
	public void  del(int PROJECT_NO);
		
}
