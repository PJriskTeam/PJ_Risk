package com.hh.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hh.bean.KeltuKaList;

public interface KeltuKaRepository {
	
	//接口中的方法名是xml中的statement的id，保证参数类型和返回值类型一致
	/* 方法名内参数是根据xml内 */
	public List<KeltuKaList>  getKeltuKa(@Param("a01m002_sect_nm")String a01m002_sect_nm,
										@Param("product_sect_nm")String product_sect_nm,
										@Param("process_name")String process_name,
			/* @Param("open_date")String open_date, */
										@Param("order_cd")String order_cd);

}
