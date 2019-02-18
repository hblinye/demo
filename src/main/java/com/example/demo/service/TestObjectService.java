package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.TestObjectMapper;
import com.example.demo.model.TestObject;

@Service
public class TestObjectService {

	@Autowired
	private TestObjectMapper testObjectMapper;
	
	public void create(TestObject object) {
		// TODO Auto-generated method stub
		testObjectMapper.insert(object);
	}

	public List<TestObject> list() {
		// TODO Auto-generated method stub
		return (List<TestObject>)testObjectMapper.selectList();
	}

	public TestObject selectByPrimaryKey(int primaryKey) {
		return testObjectMapper.selectPrimaryKey(primaryKey);
	}
}
