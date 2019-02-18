package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.TestObject;

@Mapper
public interface TestObjectMapper {
    int insert(TestObject record);

    int insertSelective(TestObject record);

	List<TestObject> selectList();

	TestObject selectPrimaryKey(int primaryKey);
}