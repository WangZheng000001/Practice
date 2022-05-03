package com.accenture.lesson06;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

	@Select("select * from M_USER ")
	List<Map<String,Object>> get();
}
